/**
 * P6Spy
 *
 * Copyright (C) 2002 P6Spy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.p6spy.engine.common;

/**
 * Assures capability of the class to be logged by {@link P6LogQuery}.
 *
 * @author Peter Butkovic
 */
public interface Loggable {

  /**
   * @return Original {@code SQL}.
   */
  String getSql();

  /**
   * @return The {@code SQL} having '?' replaced with real values used.
   */
  String getSqlWithValues();

  /**
   * @return the connection information.
   */
  ConnectionInformation getConnectionInformation();

}
