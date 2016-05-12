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

import javax.validation.constraints.Pattern;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * 
 * {@link HashBundle} is a basic implementation of {@link GuidHashCodes} .
 *
 */
public final class HashBundle implements GuidHashCodes {

  @Pattern(regexp = "[A-Z0-9]{128}")
  private String hash1;

  @Pattern(regexp = "[A-Z0-9]{128}")
  private String hash2;

  @Pattern(regexp = "[A-Z0-9]{128}")
  private String hash3;

  /**
   * Creates a {@link HashBundle}.
   */
  public HashBundle() {}

  /**
   * Creates a {@link HashBundle} by given hash codes.
   * 
   * @param hash1
   *          of a GUID
   * @param hash2
   *          of a GUID
   * @param hash3
   *          of a GUID
   */
  public HashBundle(String hash1, String hash2, String hash3) {
    this.hash1 = hash1.toUpperCase();
    this.hash2 = hash2.toUpperCase();
    this.hash3 = hash3.toUpperCase();
  }

  /**
   * Creates a {@link HashBundle} by given {@link GuidEncodable}.
   * 
   * @param guidEncodable
   *          any {@link GuidEncodable}
   */
  public HashBundle(GuidEncodable guidEncodable) {
    hash1 = guidEncodable.getHash1().toUpperCase();
    hash2 = guidEncodable.getHash2().toUpperCase();
    hash3 = guidEncodable.getHash3().toUpperCase();
  }

  @Override
  public String getHash1() {
    return hash1;
  }

  @Override
  public void setHash1(String hash1) {
    this.hash1 = hash1.toUpperCase();
  }

  @Override
  public String getHash2() {
    return hash2;
  }

  @Override
  public void setHash2(String hash2) {
    this.hash2 = hash2.toUpperCase();
  }

  @Override
  public String getHash3() {
    return hash3;
  }

  @Override
  public void setHash3(String hash3) {
    this.hash3 = hash3.toUpperCase();
  }

  @Override
  public boolean equals(final Object other) {
    if (this == other) return true;
    if (!(other instanceof HashBundle)) return false;
    HashBundle castOther = (HashBundle) other;
    return Objects.equal(hash1, castOther.hash1)
        && Objects.equal(hash2, castOther.hash2)
        && Objects.equal(hash3, castOther.hash3);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(hash1, hash2, hash3);
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this).add("hash1", hash1)
        .add("hash2", hash2).add("hash3", hash3).toString();
  }

}
