package org.treblereel;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLButtonElement;
import org.gwtproject.annotations.GwtEntryPoint;

public class App {

    @GwtEntryPoint
    public void onModuleLoad() {
        HTMLButtonElement btn = (HTMLButtonElement) DomGlobal.document.createElement("button");
        btn.textContent = "PRESS ME !";
        btn.addEventListener("click", evt -> DomGlobal.window.alert("HELLO WORLD!"));
        DomGlobal.document.body.appendChild(btn);
    }
}
