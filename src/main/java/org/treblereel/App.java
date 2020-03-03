package org.treblereel;

import elemental2.dom.DomGlobal;
import org.gwtproject.core.client.EntryPoint;

public class App implements EntryPoint {

    @Override
    public void onModuleLoad() {

        Person person = new Person();
        person.setFirstName("Ahmad");
        person.setLastName("Bawaneh");

        String personJsonString = Person_MapperImpl.INSTANCE
                .write(person);

        Person person2 = Person_MapperImpl.INSTANCE.read("{\"firstName\":\"Ahmad\",\"lastName\":\"Bawaneh\"}");
    }
}
