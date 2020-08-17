package org.treblereel;

import elemental2.dom.CSSProperties;
import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.HTMLButtonElement;
import elemental2.dom.HTMLInputElement;
import jsinterop.base.Js;
import org.treblereel.databinder.DataBinder;
import org.treblereel.databinder.property.PropertyChangeEvent;
import org.treblereel.databinder.property.PropertyChangeHandler;
import org.treblereel.proxy.Interceptor;

import java.util.function.BiFunction;

public class App {

    private static final String f_firstName = "f_firstName__org_treblereel_User_";

    User instance;

    public void onModuleLoad() {

        HTMLInputElement firstName = (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement sureName = (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement age = (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement alive = (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement result = (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
        HTMLButtonElement btn2 = (HTMLButtonElement) DomGlobal.document.createElement("button");
        alive.type = "radio";

        DomGlobal.document.body.appendChild(firstName);
        DomGlobal.document.body.appendChild(sureName);
        DomGlobal.document.body.appendChild(age);
        DomGlobal.document.body.appendChild(alive);
        DomGlobal.document.body.appendChild(DomGlobal.document.createElement("br"));
        DomGlobal.document.body.appendChild(result);
        DomGlobal.document.body.appendChild(btn);
        DomGlobal.document.body.appendChild(btn2);

        btn.textContent = "CHECK";
        btn2.textContent = "SET";

        result.style.width = CSSProperties.WidthUnionType.of("400px");

        btn.addEventListener("click", new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                result.value = instance.toString();
            }
        });

        btn2.addEventListener("click", new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                instance.setFirstName("SRT VALUE");
            }
        });

        DataBinder<User> dataBinder = DataBinder.forModel(new User());
        dataBinder.bind(firstName, "firstName");
        dataBinder.bind(sureName, "sureName");
        dataBinder.bind(age, "age");

        instance = dataBinder.getModel();
        dataBinder.addPropertyChangeHandler((PropertyChangeHandler<User>) event -> result.value = event.getSource().toString());

/*        Interceptor interceptor = new Interceptor(new User());
        instance = interceptor.getProxy();

        interceptor.addSetPropertyInterceptor(Reflect.objectProperty(f_firstName, instance), new BiFunction<Object, String, Boolean>() {
            @Override
            public Boolean apply(Object value, String propertyKey) {
                if (!value.equals(Js.asPropertyMap(instance).get("^" + propertyKey))) {
                    Js.asPropertyMap(instance).set("^" + propertyKey, value);
                }
                Js.asPropertyMap(instance).set(propertyKey, value);

                return true;
            }
        });


        firstName.addEventListener("keyup", new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                Js.asPropertyMap(instance).set(Reflect.objectProperty(f_firstName, instance), firstName.value);
            }
        });*/
    }
}
