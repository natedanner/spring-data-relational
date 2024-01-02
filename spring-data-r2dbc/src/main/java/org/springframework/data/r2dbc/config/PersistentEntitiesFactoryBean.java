/*
 * Copyright 2020-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.r2dbc.config;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.data.mapping.context.PersistentEntities;
import org.springframework.data.r2dbc.mapping.R2dbcMappingContext;

/**
 * Simple helper to be able to wire the {@link PersistentEntities} from a {@link R2dbcMappingContext} bean available in
 * the application context.
 *
 * @author Mark Paluch
 * @since 1.2
 */
public class PersistentEntitiesFactoryBean implements FactoryBean<PersistentEntities> {

	private final R2dbcMappingContext mappingContext;

	/**
	 * Creates a new {@link PersistentEntitiesFactoryBean} for the given {@link R2dbcMappingContext}.
	 *
	 * @param mappingContext must not be {@literal null}.
	 */
	public PersistentEntitiesFactoryBean(R2dbcMappingContext mappingContext) {
		this.mappingContext = mappingContext;
	}

	@Override
	public PersistentEntities getObject() {
		return PersistentEntities.of(mappingContext);
	}

	@Override
	public Class<?> getObjectType() {
		return PersistentEntities.class;
	}
}
