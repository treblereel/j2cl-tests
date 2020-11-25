/*
 * Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.gwtproject.i18n.shared.cldr;

import org.gwtproject.i18n.shared.cldr.impl.DefaultLocalizedNames;

import java.util.HashMap;

/**
 * A base class for client-side implementations of the {@link
 * LocalizedNames} interface.
 */
public abstract class LocalizedNamesImplBase extends DefaultLocalizedNames
    implements Localizable {
  
  /**
   * Add all entries in {@code override} to the original map, replacing
   * any existing entries.  This is used by subclasses that need to slightly
   * alter the data used by the parent locale.
   */
  protected static final HashMap<String, String> overrideMap(
          HashMap<String, String> original, HashMap<String, String> override) {
     original.putAll(override);
    return original;
  };

  private HashMap<String, String> jsoNameMap = null;


  @Override
  protected String[] loadLikelyRegionCodes() {
    // If this override isn't here, LocalizableGenerator-produced overrides
    // fail with a visibility error in both javac and eclipse.
    return super.loadLikelyRegionCodes();
  }

}
