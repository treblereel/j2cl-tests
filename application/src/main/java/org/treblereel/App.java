package org.treblereel;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;

public class App {

    public void onModuleLoad() {
        HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
        btn.textContent = "CLICK ME";
        btn.addEventListener("click", evt -> DomGlobal.window.alert("HELLO WORLD!"));
        DomGlobal.document.body.appendChild(btn);

        DomGlobal.console.log(new Module1().fromModule1());
        DomGlobal.console.log(new Module2().fromModule2());
    }
}
