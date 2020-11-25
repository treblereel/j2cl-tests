/*
 * Copyright © 2018 The GWT Authors
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
package org.gwtproject.i18n.client;

import elemental2.core.Global;
import elemental2.core.JsArray;
import jsinterop.base.Any;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

/**
 * A JavaScript Overlay type on top of the JSON data describing everything we need to know about a
 * particular timezone. The relevant strings of JSON can be found in TimeZoneConstants, or versions
 * localized for non-en locales can be downloaded elsewhere.
 */
public class TimeZoneInfo {

  private String id;
  private JsArray<String> names = new JsArray<>();
  private int std_offset;
  private JsArray<Integer> transitions = new JsArray<>();

  public static TimeZoneInfo buildTimeZoneData(String json) {
    TimeZoneInfo timeZoneInfo = new TimeZoneInfo();
    JsPropertyMap<?> parsed = Js.cast(Global.JSON.parse(json));
    timeZoneInfo.id = Js.cast(parsed.get("id"));
    timeZoneInfo.std_offset = Js.cast(parsed.get("std_offset"));
    timeZoneInfo.names = Js.cast(parsed.get("names"));
    JsArray<Any> jsTransitions = Js.cast(parsed.get("transitions"));
    for (int i = 0; i < jsTransitions.length; i++) {
      timeZoneInfo.transitions.push(jsTransitions.getAt(i).asInt());
    }

    return timeZoneInfo;
  }

  protected TimeZoneInfo() {}

  public final String getID() {
    return this.id;
  }

  public final JsArray<String> getNames() {
    return this.names;
  }

  public final int getStandardOffset() {
    return this.std_offset;
  }

  public final JsArray<Integer> getTransitions() {
    return this.transitions;
  }
}
