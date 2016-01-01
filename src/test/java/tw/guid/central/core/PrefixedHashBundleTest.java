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

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.google.common.testing.EqualsTester;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class PrefixedHashBundleTest {

  @Test
  public void testBean() {
    EqualsVerifier.forClass(PrefixedHashBundle.class)
        .suppress(Warning.NONFINAL_FIELDS).verify();
  }

  @Test
  public void testUpperCase() {
    PrefixedHashBundle phb = new PrefixedHashBundle();
    phb.setPrefix("p");
    phb.setHash1("A");
    phb.setHash2("b");
    phb.setHash3("C");

    new EqualsTester()
        .addEqualityGroup(phb, new PrefixedHashBundle("p", "a", "b", "c"),
            new PrefixedHashBundle(new GuidEncodable() {

              @Override
              public String getPrefix() {
                return "p";
              }

              @Override
              public void setPrefix(String prefix) {}

              @Override
              public String getHash1() {
                return "A";
              }

              @Override
              public void setHash1(String hash1) {}

              @Override
              public String getHash2() {
                return "B";
              }

              @Override
              public void setHash2(String hash2) {}

              @Override
              public String getHash3() {
                return "C";
              }

              @Override
              public void setHash3(String hash3) {}

            }))
        .testEquals();
    assertEquals("PrefixedHashBundle{prefix=p, hash1=A, hash2=B, hash3=C}",
        phb.toString());
    assertEquals("p", phb.getPrefix());
    assertEquals("A", phb.getHash1());
    assertEquals("B", phb.getHash2());
    assertEquals("C", phb.getHash3());
  }

}
