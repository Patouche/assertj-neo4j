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
import org.assertj.neo4j.api.beta.type.Nodes;

import java.util.List;

/**
 * @author patouche - 08/11/2020
 */
public class DriverNodesAssert
        extends AbstractNodesAssert<DriverNodesAssert, Nodes, DriverNodesAssert> {

    /**
     * Create new assertions on {@link Nodes}.
     *
     * @param nodes the nodes to assert
     */
    public DriverNodesAssert(final Nodes nodes) {
        this(nodes.load(), nodes, null);
    }

    @VisibleForTesting
    protected DriverNodesAssert(final List<Nodes.DbNode> entities) {
        this(entities, null,  null);
    }

    private DriverNodesAssert(final List<Nodes.DbNode> entities, final Nodes nodes, final DriverNodesAssert parent) {
        super(DriverNodesAssert.class, entities, nodes, factory(), parent, rootAssert(parent));
    }

    private static EntitiesAssertFactory<DriverNodesAssert, Nodes.DbNode, DriverNodesAssert> factory() {
        return (entities, current) -> new DriverNodesAssert(entities, current.dbData, current);
    }

}
