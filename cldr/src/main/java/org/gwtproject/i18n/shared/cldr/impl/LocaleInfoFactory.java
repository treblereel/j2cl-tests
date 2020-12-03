package org.gwtproject.i18n.shared.cldr.impl;

import javax.annotation.Generated;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsMethod;

@Generated("gwt-cldr-importer : org.gwtproject.tools.cldr.LocalesNativeNamesProcessor, CLDR version : release-34")
public class LocaleInfoFactory {

  public static org.gwtproject.i18n.shared.cldr.LocaleInfoImpl create() {
    String locale = System.getProperty("locale");
    DomGlobal.console.log("Locale " + locale);
    return get(locale);
  }

  @JsMethod
  public static native org.gwtproject.i18n.shared.cldr.LocaleInfoImpl get(String locale);

}
