package org.treblereel.web;

import com.vertispan.j2cl.wasm.J2wasm;
import elemental2.core.Function;
import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

@JsType
public class WebApplication {

    public void init() {
        DomGlobal.console.log("Hello world!");
        J2wasm.instantiateStreaming(J2wasm.InstantiateStreamingUrlOrResponseUnionType.of("application.wasm")).then(instance -> {
            String result =  (String) Js.<Function>uncheckedCast(Js.asPropertyMap(instance.exports).get("onModuleLoad")).apply();
            DomGlobal.console.log(result);
            return null;
        });

    }

}
