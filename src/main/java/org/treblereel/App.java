package org.treblereel;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.EventListener;
import elemental2.dom.HTMLInputElement;

public class App {

    public void onModuleLoad() {

        HTMLInputElement firstName =  (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement sureName =  (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement age =  (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement alive =  (HTMLInputElement) DomGlobal.document.createElement("input");
        HTMLInputElement result =  (HTMLInputElement) DomGlobal.document.createElement("input");
        alive.type = "radio";

        DomGlobal.document.body.appendChild(firstName);
        DomGlobal.document.body.appendChild(sureName);
        DomGlobal.document.body.appendChild(age);
        DomGlobal.document.body.appendChild(alive);
        DomGlobal.document.body.appendChild(DomGlobal.document.createElement("br"));
        DomGlobal.document.body.appendChild(result);

        firstName.addEventListener("change", new EventListener() {
            @Override
            public void handleEvent(Event evt) {
                DomGlobal.console.log("firstName " + firstName.value);
            }
        });

        DomGlobal.console.log("?");
        new Test();

    }
}
