/*
 *
 * Copyright 2016 Wei-Ming Wu
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
 * {@link GuidHashCodes} defines the hash codes of a GUID.
 *
 */
public interface GuidHashCodes {

  public String getHash1();

  public void setHash1(String hash1);

  public String getHash2();

  public void setHash2(String hash2);

  public String getHash3();

  public void setHash3(String hash3);

}
