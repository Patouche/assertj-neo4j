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
package org.assertj.neo4j.api.beta.integrations;

import org.assertj.neo4j.api.beta.DriverAssertions;
import org.assertj.neo4j.api.beta.testing.AbstractIntegrationTests;
import org.assertj.neo4j.api.beta.testing.Dataset;
import org.assertj.neo4j.api.beta.type.Relationships;
import org.junit.jupiter.api.Test;

/**
 * https://insights.stackoverflow.com/survey/2020#correlated-technologies
 *
 * @author patouche - 5/26/20.
 */
class SampleRelationshipsIntegrationTests extends AbstractIntegrationTests {

    public SampleRelationshipsIntegrationTests() {
        super(Dataset.GITHUB_LANGUAGE);
    }

    @Test
    public void full() {
        final Relationships relationships = new Relationships(driver, "KNOWS");
        DriverAssertions.assertThat(relationships)
                .hasSize(7)
                .haveType("Language")
                .haveProperties("name")
                .ignoringIds()
                .contains(Relationships.relation().type("Language").property("name", "Scala").build());
    }

    @Test
    public void ignoringIds() {
        final Relationships relationships = new Relationships(driver, "KNOWS");
        DriverAssertions.assertThat(relationships)
                .hasSize(7)
                .haveType("Language")
                .haveProperties("name")
                .ignoringIds()
                .contains(Relationships.relation().type("Language").property("name", "Scala").build());
    }

    @Test
    public void haveType() {
        final Relationships relationships = new Relationships(driver, "KNOWS");
        DriverAssertions.assertThat(relationships)
                .hasSize(7)
                .haveType("Language")
                .haveProperties("name")
                .ignoringIds()
                .contains(Relationships.relation().type("Language").property("name", "Scala").build());
    }

    @Test
    public void haveProperties() {
        final Relationships relationships = new Relationships(driver, "KNOWS");
        DriverAssertions.assertThat(relationships)
                .hasSize(7)
                .haveType("Language")
                .haveProperties("name")
                .ignoringIds()
                .contains(Relationships.relation().type("Language").property("name", "Scala").build());
    }

}
