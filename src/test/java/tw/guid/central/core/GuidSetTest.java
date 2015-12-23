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

import java.util.Arrays;

import org.junit.Test;
import org.meanbean.test.BeanTester;

import com.google.common.testing.EqualsTester;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

public class GuidSetTest {

  @Test
  public void testBean() {
    BeanTester beanTester = new BeanTester();
    beanTester.testBean(GuidSet.class);

    EqualsVerifier.forClass(GuidSet.class).suppress(Warning.NONFINAL_FIELDS)
        .verify();

    new EqualsTester()
        .addEqualityGroup(new GuidSet<PublicGuid>(new PublicGuid("a", "b")),
            new GuidSet<PublicGuid>(Arrays.asList(new PublicGuid("a", "b"))))
        .testEquals();
  }

}
