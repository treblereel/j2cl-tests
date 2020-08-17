/*
 * Copyright (C) 2011 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.treblereel.databinder;

import org.treblereel.databinder.converter.Converter;

/**
 * Represents the binding of a bean property to a widget and holds all relevant binding-specific
 * metadata.
 *
 * @author Christian Sadilek <csadilek@redhat.com>
 */
public final class Binding {

  private final String property;
  private final Object component;
  private final Converter<?, ?> converter;

  public Binding(final String property, Object component, Converter<?, ?> converter) {
    this.property = property;
    this.component = component;
    this.converter = converter;
  }

  public String getProperty() {
    return property;
  }

  public Converter<?, ?> getConverter() {
    return converter;
  }

  public Object getComponent() {
    return component;
  }

  public Object getHandlerMap() {
    return null;
  }

  public void removeHandlers() {

  }

  @Override
  public String toString() {
    return "Binding [property=" + property + ", widget=" + component + "]";
  }

}
