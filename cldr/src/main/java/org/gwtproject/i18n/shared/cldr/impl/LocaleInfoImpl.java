package org.gwtproject.i18n.shared.cldr.impl;

import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;
import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfo;
import org.gwtproject.i18n.shared.cldr.DateTimeFormatInfoImpl;
import org.gwtproject.i18n.shared.cldr.LocalizedNames;
import org.gwtproject.i18n.shared.cldr.NumberConstants;

@Generated("gwt-cldr-importer : org.gwtproject.tools.cldr.LocalesNativeNamesProcessor, CLDR version : release-34")
public class LocaleInfoImpl extends org.gwtproject.i18n.shared.cldr.LocaleInfoImpl {
  @Override
  public String getLocaleName() {
    return "default";
  }

  @Override
  public LocalizedNames getLocalizedNames() {
    return new LocalizedNamesImpl();
  }

  @Override
  public DateTimeFormatInfo getDateTimeFormatInfo() {
    return new DateTimeFormatInfoImpl();
  }

  @Override
  public NumberConstants getNumberConstants() {
    return new NumberConstantsImpl();
  }

  @Override
  public boolean isRTL() {
    return false;
  }
}
