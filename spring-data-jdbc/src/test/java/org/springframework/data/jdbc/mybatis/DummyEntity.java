/*
 * Copyright 2017-2024 the original author or authors.
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
package org.springframework.data.jdbc.mybatis;

import lombok.With;

import org.apache.ibatis.type.Alias;
import org.springframework.data.annotation.Id;

/**
 * @author Jens Schauder
 */
@Alias("DummyEntity")
class DummyEntity {

	@With @Id final Long id;
	final String name;

	public DummyEntity(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
