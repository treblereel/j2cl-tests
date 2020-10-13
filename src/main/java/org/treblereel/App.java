package org.treblereel;

import java.util.ArrayList;
import java.util.List;

import elemental2.dom.DomGlobal;
import org.dominokit.jacksonapt.DefaultJsonSerializationContext;
import org.dominokit.jacksonapt.JsonSerializationContext;
import org.dominokit.jacksonapt.exception.JsonSerializationException;
import org.treblereel.dto.ExtensionElement;
import org.treblereel.dto.Import;

public class App {

    public void onModuleLoad() {
        try {
            Definitions definitions = new Definitions();
            List<org.treblereel.Import> imports = new ArrayList<>();
            imports.add(new org.treblereel.Import("AAA", "BBB"));
            imports.add(new org.treblereel.Import("AAA1", "BBB1"));
            imports.add(new org.treblereel.Import("AAA2", "BBB2"));
            imports.add(new org.treblereel.Import("AAA3", "BBB3"));
            definitions.setImports(imports);

            List<ExtensionElement> extensionElements = new ArrayList<>();
            definitions.setElements(extensionElements);
            extensionElements.add(new Import("AAAA"));
            extensionElements.add(new Import("CCC"));

            JsonSerializationContext context = DefaultJsonSerializationContext.builder()
                    .serializeNulls(false)
                    .writeEmptyJsonArrays(false)
                    .build();

            String result = org.treblereel.Definitions_MapperImpl.INSTANCE.write(definitions, context);
            DomGlobal.console.log("REZ " + result);
        } catch (JsonSerializationException e) {
            e.printStackTrace();
        }
    }
}
