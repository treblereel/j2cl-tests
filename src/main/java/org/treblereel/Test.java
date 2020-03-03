package org.treblereel;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 5/23/20
 */
@JsType
public class Test {


    public Test() {
        DomGlobal.console.log("Test ready");
    }
}
