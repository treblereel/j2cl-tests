package org.treblereel;

import elemental2.dom.DomGlobal;
import org.gwtproject.core.client.EntryPoint;
import org.gwtproject.i18n.client.NumberFormat;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {
        NumberFormat formatter = NumberFormat.getFormat("#,###");
        DomGlobal.console.log(formatter.format(100));
    }
}
