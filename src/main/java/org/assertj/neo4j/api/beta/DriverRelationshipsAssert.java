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
package org.assertj.neo4j.api.beta;

import org.assertj.core.util.VisibleForTesting;
import org.assertj.neo4j.api.beta.type.DataLoader;
import org.assertj.neo4j.api.beta.type.Relationships;

import javax.xml.crypto.Data;
import java.util.List;

/**
 * @author patouche - 24/11/2020
 */
//@formatter:off
public class DriverRelationshipsAssert
        extends AbstractRelationshipsAssert<DriverRelationshipsAssert,
                                            DriverRelationshipsAssert,
                                            DriverRelationshipsAssert> {
//@formatter:off

    /**
     * Create new assertions on {@link Relationships}.
     *
     * @param relationships the relationships to assert
     */
    public DriverRelationshipsAssert(final Relationships relationships) {
        this(relationships.load(), relationships,false, null);
    }

    @VisibleForTesting
    protected DriverRelationshipsAssert(final List<Relationships.DbRelationship> entities) {
        this(entities, null, false,null);
    }

    private DriverRelationshipsAssert(final List<Relationships.DbRelationship> entities,
                                      final DataLoader<Relationships.DbRelationship> loader,
                                      final boolean ignorindIds,
                                      final DriverRelationshipsAssert parent) {
        super(DriverNodesAssert.class, entities, loader, ignorindIds, DriverRelationshipsAssert::new, parent, rootAssert(parent));
    }

}
