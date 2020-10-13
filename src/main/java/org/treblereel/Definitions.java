/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.treblereel;

import java.util.List;

import org.dominokit.jacksonapt.annotation.JSONMapper;
import org.treblereel.dto.ExtensionElement;

@JSONMapper
public class Definitions {

    private List<Import> imports;

    private List<ExtensionElement> elements;

    public List<ExtensionElement> getElements() {
        return elements;
    }

    public void setElements(List<ExtensionElement> elements) {
        this.elements = elements;
    }

    public List<Import> getImports() {
        return imports;
    }

    public void setImports(List<Import> imports) {
        this.imports = imports;
    }
}
