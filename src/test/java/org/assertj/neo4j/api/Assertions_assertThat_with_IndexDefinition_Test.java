/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2013-2020 the original author or authors.
 */
package org.assertj.neo4j.api;

import org.junit.Assert;
import org.junit.Test;
import org.neo4j.graphdb.schema.IndexDefinition;

import static org.assertj.neo4j.api.Assertions.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertSame;
import static org.mockito.Mockito.mock;

public class Assertions_assertThat_with_IndexDefinition_Test {

  @Test
  public void should_create_Assert() {
    Assert.assertThat(assertThat(mock(IndexDefinition.class)), instanceOf(
      IndexDefinitionAssert.class));
  }

  @Test
  public void should_pass_actual() {
    IndexDefinition indexDefinition = mock(IndexDefinition.class);
    IndexDefinitionAssert indexDefinitionAssert = assertThat(indexDefinition);
    assertSame(indexDefinition, indexDefinitionAssert.getActual());
  }

}
