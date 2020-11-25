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

import org.gwtproject.i18n.shared.cldr.impl.CurrencyList_factory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Generated class containing all the CurrencyImpl instances.  This is just
 * the fallback in case the I18N module is not included.
 */
public class CurrencyList implements Iterable<CurrencyData> {

    /**
     * Inner class to avoid CurrencyList.clinit calls and allow this to be
     * completely removed from the generated code if instance isn't referenced
     * (such as when all you call is CurrencyList.get().getDefault() ).
     */
    private static class CurrencyListInstance {
        //TODO Create the instance using the APT generated factory
//        private static CurrencyList instance = GWT.create(CurrencyList.class);

        private static CurrencyList instance = CurrencyList_factory.create();
    }

    /**
     * Return the singleton instance of CurrencyList.
     */
    public static CurrencyList get() {
        return CurrencyListInstance.instance;
    }



    /**
     * Map of currency codes to CurrencyData.
     */
    protected HashMap<String, CurrencyData> dataMap;


    /**
     * Map of currency codes to localized currency names. This is kept separate
     * from {@link #dataMap} above so that the names can be completely removed by
     * the compiler if they are not used.
     */
    protected HashMap<String, String> namesMap;


    /**
     * Returns an iterator for the list of currencies.
     * <p>
     * Deprecated currencies will not be included.
     */
    @Override
    public final Iterator<CurrencyData> iterator() {
        return iterator(false);
    }

    /**
     * Returns an iterator for the list of currencies, optionally including
     * deprecated ones.
     *
     * @param includeDeprecated true if deprecated currencies should be included
     */
    public final Iterator<CurrencyData> iterator(boolean includeDeprecated) {
        ensureCurrencyMap();
        ArrayList<CurrencyData> collection = new ArrayList<CurrencyData>();

        for (CurrencyData item : dataMap.values()) {
            collection.add(item);
        }
        if (!includeDeprecated) {
            ArrayList<CurrencyData> newCollection = new ArrayList<CurrencyData>();
            for (CurrencyData value : collection) {
                if (!value.isDeprecated()) {
                    newCollection.add(value);
                }
            }
            collection = newCollection;
        }
        return Collections.unmodifiableList(collection).iterator();
    }

    /**
     * Lookup a currency based on the ISO4217 currency code.
     *
     * @param currencyCode ISO4217 currency code
     * @return currency data, or null if code not found
     */
    public final CurrencyData lookup(String currencyCode) {
        ensureCurrencyMap();
        return dataMap.get(currencyCode);
    }

    /**
     * Lookup a currency name based on the ISO4217 currency code.
     *
     * @param currencyCode ISO4217 currency code
     * @return name of the currency, or null if code not found
     */
    public final String lookupName(String currencyCode) {
        ensureNamesMap();
        String result = namesMap.get(currencyCode);
        return (result == null) ? currencyCode : result;
    }

    /**
     * Return the default currency data for this locale.
     * <p>
     * Generated implementations override this method.
     */
    public CurrencyData getDefault() {
        return new CurrencyDataImpl("USD", "$", 2, "US$", "$");
    }

    /**
     * Loads the currency map.
     * <p>
     * Generated implementations override this method.
     */
    protected HashMap<String, CurrencyData> loadCurrencyMap() {
        HashMap<String, CurrencyData> result = new HashMap<String, CurrencyData>();
        result.put("USD", new CurrencyDataImpl("USD", "$", 2, "US$", "$"));
        result.put("EUR", new CurrencyDataImpl("EUR", "€", 2, "€", "€"));
        result.put("GBP", new CurrencyDataImpl("GBP", "UK£", 2, "UK£", "£"));
        result.put("JPY", new CurrencyDataImpl("JPY", "¥", 0, "JP¥", "¥"));
        return result;
    }

    /**
     * Loads the currency names map.
     * <p>
     * Generated implementations override this method.
     */
    protected HashMap<String, String> loadNamesMap() {
        HashMap<String, String> result = new HashMap<String, String>();
        result.put("USD", "US Dollar");
        result.put("EUR", "Euro");
        result.put("GBP", "British Pound Sterling");
        result.put("JPY", "Japanese Yen");
        return result;
    }

    /**
     * Ensure that the map of currency data has been initialized.
     */
    private void ensureCurrencyMap() {
        if (dataMap == null) {
            dataMap = loadCurrencyMap();
        }
    }

    /**
     * Ensure that the map of currency data has been initialized.
     */
    private void ensureNamesMap() {
        if (namesMap == null) {
            namesMap = loadNamesMap();
        }
    }
}
