package org.treblereel;

import elemental2.dom.DomGlobal;
import org.gwtproject.core.client.EntryPoint;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        DomGlobal.window.alert("RUN");
    }
}
