/*
 *
 * Copyright 2015 Wei-Ming Wu
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
 *
 */
package tw.guid.central.core;

/**
 * 
 * {@link GuidDecodable} allows to be converted to {@link GuidEncodable}.
 *
 */
public interface GuidDecodable {

  /**
   * Returns the prefix of the GUID.
   * 
   * @return prefix of the GUID
   */
  public String getPrefix();

  /**
   * Sets the prefix of the GUID.
   * 
   * @param prefix
   *          of the GUID
   */
  public void setPrefix(String prefix);

  /**
   * Returns the code of the GUID.
   * 
   * @return code of the GUID
   */
  public String getCode();

  /**
   * Sets the code of the GUID.
   * 
   * @param code
   *          of the GUID
   */
  public void setCode(String code);

}
