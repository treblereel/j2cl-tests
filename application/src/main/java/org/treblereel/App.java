package org.treblereel;

public class App {

    @WasmEntryPoint
    public static String onModuleLoad() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Bilbo Bagins\n");
        stringBuffer.append("Gendalf the Grey\n");
        stringBuffer.append("Gimli\n");
        stringBuffer.append("Legolas\n");
        stringBuffer.append("Frodo Baggins\n");
        stringBuffer.append("Samwise Gamgee\n");
        stringBuffer.append("Meriadoc Brandybuck\n");
        stringBuffer.append("Peregrin Took\n");
        stringBuffer.append("Aragorn\n");
        stringBuffer.append("Boromir\n");
        stringBuffer.append("Gollum\n");
        stringBuffer.append("Sauron\n");


        ConsoleUtils.log("info", new Module1().fromModule1());
        ConsoleUtils.log("error", new Module2().fromModule2());

        if(true) {
            //throw new RuntimeException();
        }


        return stringBuffer.toString();
    }
}
