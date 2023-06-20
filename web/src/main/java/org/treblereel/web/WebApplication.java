package org.treblereel.web;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsType;

@JsType
public class WebApplication {

    public void init() {
        DomGlobal.console.log("Hello world!");
    }
}
