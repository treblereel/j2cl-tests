package test;

import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 10/22/20
 */
@JsType(namespace = "test", isNative = true)
public class SampleJsModule {

    public SampleJsModule(){

    }

    public native String helloWorld();
}
