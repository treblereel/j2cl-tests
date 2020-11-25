/*
 * Copyright 2008 Google Inc.
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

import org.gwtproject.i18n.shared.cldr.impl.LocaleInfoFactory;

/**
 * Provides access to the currently-active locale and the list of available
 * locales.
 */
@SuppressWarnings("deprecation")
public class LocaleInfo {

//  /**
//   * Currently we only support getting the currently running locale, so this
//   * is a static.  In the future, we would need a hash map from locale names
//   * to LocaleInfo instances.
//   */
//  private static LocaleInfo instance  = new LocaleInfo(
//      (LocaleInfoImpl) GWT.create(LocaleInfoImpl.class),
//      (CldrImpl) GWT.create(CldrImpl.class));
  /**
   * Currently we only support getting the currently running locale, so this
   * is a static.  In the future, we would need a hash map from locale names
   * to LocaleInfo instances.
   */
  //TODO replace with generated implementations
  private static LocaleInfo instance  = new LocaleInfo(
          LocaleInfoFactory.create());



  /**
   * Returns a LocaleInfo instance for the current locale.
   */
  public static final LocaleInfo getCurrentLocale() {
    /*
     * In the future, we could make additional static methods which returned a
     * LocaleInfo instance for a specific locale (from the set of those the app
     * was compiled with), accessed via a method like:
     *    public static LocaleInfo getLocale(String localeName)
     */
    return instance;
  }

  private final LocaleInfoImpl infoImpl;

  private DateTimeFormatInfo dateTimeFormatInfo;

  private NumberConstants numberConstants;

  /**
   * Constructor to be used by subclasses, such as mock classes for testing.
   * Any such subclass should override all methods.
   */
  protected LocaleInfo() {
    infoImpl = LocaleInfoFactory.create();
  }

  /**
   * Create a LocaleInfo instance, passing in the implementation classes.
   *
   * @param impl LocaleInfoImpl instance to use
   */
  private LocaleInfo(LocaleInfoImpl impl) {
    this.infoImpl = impl;
  }

  /**
   * Returns a DateTimeConstants instance for this locale.
   */
  public final DateTimeFormatInfo getDateTimeFormatInfo() {
    ensureDateTimeFormatInfo();
    return dateTimeFormatInfo;
  }

  /**
   * Returns the name of this locale, such as "default, "en_US", etc.
   */
  public final String getLocaleName() {
    return infoImpl.getLocaleName();
  }

  /**
   * @return an implementation of {@link LocalizedNames} for this locale.
   */
  public final LocalizedNames getLocalizedNames() {
    return infoImpl.getLocalizedNames();
  }

  /**
   * Returns a NumberConstants instance for this locale.
   */
  public final NumberConstants getNumberConstants() {
    ensureNumberConstants();
    return numberConstants;
  }

  /**
   * Returns true if this locale is right-to-left instead of left-to-right.
   */
  public final boolean isRTL() {
    return infoImpl.isRTL();
  }

  private void ensureDateTimeFormatInfo() {
    if (dateTimeFormatInfo == null) {
      dateTimeFormatInfo = infoImpl.getDateTimeFormatInfo();
    }
  }

  private void ensureNumberConstants() {
    if (numberConstants == null) {
      numberConstants = infoImpl.getNumberConstants();
    }
  }
}
