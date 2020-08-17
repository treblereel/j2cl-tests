package org.treblereel.proxy;

import jsinterop.base.Js;

import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 1/1/20
 */
public final class OnFieldAccessed implements BiFunction<Object, String, Object> {

    private final Supplier supplier;

    public OnFieldAccessed(Supplier supplier) {
        this.supplier = supplier;
    }

    @Override
    public Object apply(Object o, String propertyKey) {
        if (Js.asPropertyMap(o).get(propertyKey) == null) {
            Js.asPropertyMap(o).set(propertyKey, supplier.get());
        }
        return Js.asPropertyMap(o).get(propertyKey);
    }
}
