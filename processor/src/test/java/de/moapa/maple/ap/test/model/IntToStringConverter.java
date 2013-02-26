/**
 *  Copyright 2012-2013 Gunnar Morling (http://www.gunnarmorling.de/)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package de.moapa.maple.ap.test.model;

import de.moapa.maple.converter.Converter;

public class IntToStringConverter implements Converter<Integer, String> {

	@Override
	public String from(Integer source) {
		return source != null ? source.toString() : null;
	}

	@Override
	public Integer to(String target) {
		return target != null ? Integer.valueOf( target ) : null;
	}
}
