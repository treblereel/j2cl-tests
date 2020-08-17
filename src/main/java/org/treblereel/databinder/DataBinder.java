package org.treblereel.databinder;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLInputElement;
import jsinterop.base.Js;
import org.treblereel.UserInfo;
import org.treblereel.collections.Multimap;
import org.treblereel.databinder.converter.Convert;
import org.treblereel.databinder.converter.Converter;
import org.treblereel.databinder.property.PropertyChangeEvent;
import org.treblereel.databinder.property.PropertyChangeHandler;
import org.treblereel.proxy.Interceptor;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 8/10/20
 */
public class DataBinder<T> implements HasPropertyChangeHandlers {
    private final PropertyChangeHandlerSupport propertyChangeHandlerSupport = new PropertyChangeHandlerSupport();
    private final Multimap<String, Binding> bindings = new Multimap<>();
    private Interceptor interceptor;
    private T model;

    private DataBinder(T t) {
        interceptor = new Interceptor(t);
        this.model = interceptor.getProxy();
    }

    public static <T> DataBinder<T> forModel(final T model) {
        return new DataBinder<>(model);
    }

    public DataBinder<T> bind(final Object component, final String property) {
        Converter<String, String> converter = Convert.getConverter(String.class, String.class);
        return bind(component, property, converter);
    }

    public DataBinder<T> bind(final Object component, final String property, Converter converter) {
        Binding binding = new Binding(property, component, converter);

        Js.asPropertyMap(model).forEach(k -> {
            DomGlobal.console.log("KKK " + k + " " + Js.asPropertyMap(model).get(k));
        });

        DomGlobal.console.log("bind " + Js.asPropertyMap(model).get(UserInfo.get(binding.getProperty(), Js.uncheckedCast(model))) + " " +
                Js.typeof(Js.asPropertyMap(model).get(UserInfo.get(binding.getProperty(), Js.uncheckedCast(model)))));

        bindings.put(property, new Binding(property, component, converter));
        addSetPropertyInterceptor(binding);
        addEventListener(binding);
        return this;
    }

    private void addEventListener(Binding binding) {
        if (binding.getComponent() instanceof HTMLInputElement) {
            HTMLInputElement element = (HTMLInputElement) binding.getComponent();
            String property = UserInfo.get(binding.getProperty(), Js.uncheckedCast(model));
            element.addEventListener("keyup", evt -> {
                Object value = binding.getConverter().toModelValue(Js.uncheckedCast(element.value));
                Js.asPropertyMap(model).set(property, value);
            });
        } else {
            throw new Error("Unable to add EventListener " + binding.getComponent());
        }

    }

    private void addSetPropertyInterceptor(Binding binding) {
        interceptor.addSetPropertyInterceptor(UserInfo.get(binding.getProperty(), Js.uncheckedCast(model)), (value, propertyKey) -> {
            Object oldValue = Js.asPropertyMap(model).get(propertyKey);
            if (!value.equals(Js.asPropertyMap(model).get("^" + propertyKey))) {
                Js.asPropertyMap(model).set("^" + propertyKey, value);
            }
            Js.asPropertyMap(model).set(propertyKey, value);
            Object toWidget = binding.getConverter().toWidgetValue(Js.uncheckedCast(value));
            Js.<HTMLInputElement>uncheckedCast(binding.getComponent()).value = Js.uncheckedCast(toWidget);
            propertyChangeHandlerSupport.notifyHandlers(new PropertyChangeEvent<>(model, binding.getProperty(), oldValue, value));
            return true;
        });
    }

    public T getModel() {
        return model;
    }

    @Override
    public PropertyChangeUnsubscribeHandle addPropertyChangeHandler(PropertyChangeHandler<?> handler) {
        propertyChangeHandlerSupport.addPropertyChangeHandler(handler);
        return () -> propertyChangeHandlerSupport.removePropertyChangeHandler(handler);
    }

    @Override
    public <T> PropertyChangeUnsubscribeHandle addPropertyChangeHandler(String property, PropertyChangeHandler<T> handler) {
        propertyChangeHandlerSupport.addPropertyChangeHandler(property, handler);
        return () -> propertyChangeHandlerSupport.removePropertyChangeHandler(property, handler);
    }
}
