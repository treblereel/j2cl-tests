package org.treblereel;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLAnchorElement;
import elemental2.dom.HTMLElement;
import elemental2.dom.HTMLLIElement;
import elemental2.dom.HTMLTableCellElement;
import elemental2.dom.HTMLTableElement;
import elemental2.dom.HTMLTableRowElement;
import jsinterop.base.Js;
import org.gwtproject.i18n.client.DateTimeFormat;
import org.gwtproject.i18n.client.NumberFormat;
import org.gwtproject.i18n.shared.cldr.I18N;
import org.gwtproject.i18n.shared.cldr.LocaleInfo;

@I18N({"en", "es", "de", "fr", "it", "ru"})
public class App {

    private HTMLTableElement tableElement;
    private HTMLTableCellElement r1td2;
    private HTMLTableCellElement r2td2;
    private HTMLTableCellElement r3td2;
    private HTMLTableCellElement r4td2;
    private HTMLTableCellElement r5td2;
    private HTMLTableCellElement r6td2;
    private HTMLTableCellElement r7td2;
    private HTMLTableCellElement r8td2;
    private Date today = new Date();
    private double value = 12345.6789;


    public void onModuleLoad() {

        String[] locales = {"en", "es", "de", "fr", "it", "ru"};

        HTMLElement ul = (HTMLElement) DomGlobal.document.createElement("ul");
        DomGlobal.document.body.appendChild(ul);

        for (String locale : locales) {
            HTMLLIElement li = (HTMLLIElement) DomGlobal.document.createElement("li");
            ul.appendChild(li);

            HTMLAnchorElement btn = (HTMLAnchorElement) DomGlobal.document.createElement("a");
            btn.textContent = locale;
            btn.href = "?locale=" + locale + "#" + locale;

            DomGlobal.window.onload = p0 -> {
                updateLocaleTable();
                return null;
            };

            li.appendChild(btn);
        }
        tableElement = (HTMLTableElement) DomGlobal.document.createElement("table");
        tableElement.style.width = Js.uncheckedCast("40%");
        DomGlobal.document.body.appendChild(tableElement);

        r1td2 = addRow("locale name");
        r2td2 = addRow("Currency");
        r3td2 = addRow("isRTL");
        r4td2 = addRow("week");
        r5td2 = addRow("ShortDateFormat");
        r6td2 = addRow("FullDateFormat");
        r7td2 = addRow("ScientificFormat");
        r8td2 = addRow("DecimalFormat");
    }

    private void updateLocaleTable() {
        LocaleInfo localeInfo = LocaleInfo.getCurrentLocale();

        r1td2.textContent = localeInfo.getLocaleName();
        r2td2.textContent = localeInfo.getNumberConstants().defCurrencyCode();
        r3td2.textContent = String.valueOf(localeInfo.isRTL());
        r4td2.textContent = Arrays.stream(localeInfo.getDateTimeFormatInfo().weekdaysFullStandalone()).collect(Collectors.joining(", "));

        r5td2.textContent = DateTimeFormat.getShortDateFormat().format(today);
        r6td2.textContent = DateTimeFormat.getFullDateTimeFormat().format(today);

        r7td2.textContent = NumberFormat.getScientificFormat().format(value);
        r8td2.textContent = NumberFormat.getDecimalFormat().format(value);
    }

    private HTMLTableCellElement addRow(String name) {
        HTMLTableRowElement r = (HTMLTableRowElement) DomGlobal.document.createElement("tr");
        HTMLTableCellElement td1 = (HTMLTableCellElement) DomGlobal.document.createElement("td");
        HTMLTableCellElement td2 = (HTMLTableCellElement) DomGlobal.document.createElement("td");
        r.appendChild(td1);
        r.appendChild(td2);
        tableElement.append(r);

        td1.textContent = name;
        return td2;
    }
}
