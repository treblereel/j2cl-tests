package org.treblereel;

public class App {

    @WasmEntryPoint
    public static void onModuleLoad() {

        new Module1().fromModule1();
        new Module2().fromModule2();

        //System.out.println(new Module1().fromModule1());
        //System.out.println(new Module2().fromModule2());
    }
}