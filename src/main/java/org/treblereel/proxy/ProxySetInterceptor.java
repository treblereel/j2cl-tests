package org.treblereel.proxy;

import elemental2.dom.DomGlobal;
import jsinterop.base.Js;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 12/18/19
 */
public final class ProxySetInterceptor implements SetFN {

    private Object target;

    private Map<String, BiFunction<Object, String, Boolean>> propHolder = new HashMap<>();

    public ProxySetInterceptor(Object target) {
        this.target = target;
    }

    public void addProperty(String obfuscated, BiFunction function) {
        propHolder.put(obfuscated, function);
    }

    @Override
    public boolean onInvoke(Object object, String objectKey, Object value) {
        if (object.equals(target) && propHolder.containsKey(objectKey)) {
            if (Js.asPropertyMap(object).has("^" + objectKey) &&
                    Js.asPropertyMap(object).get("^" + objectKey).equals(value)) {
                Js.asPropertyMap(object).set(objectKey, value);
            } else {
                propHolder.get(objectKey).apply(value, objectKey);
            }
        } else {
            Js.asPropertyMap(object).set(objectKey, value);
        }
        return true;
    }
}
