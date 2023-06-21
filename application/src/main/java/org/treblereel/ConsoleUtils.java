package org.treblereel;

import jsinterop.annotations.JsType;

@JsType(namespace = "j2wasm")
public class ConsoleUtils {


    public static native void log(String level, String msg);
}
