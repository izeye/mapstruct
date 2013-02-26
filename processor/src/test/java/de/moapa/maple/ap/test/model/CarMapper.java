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

import java.util.ArrayList;

import de.moapa.maple.Mapper;
import de.moapa.maple.Mappers;
import de.moapa.maple.Mapping;
import de.moapa.maple.Mappings;

@Mapper
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

	@Mappings({
			@Mapping(source = "numberOfSeats", target = "seatCount"),
			@Mapping(source = "yearOfManufacture", target = "manufacturingYear", converter = IntToStringConverter.class)
	})
	CarDto carToCarDto(Car car);

	Car carDtoToCar(CarDto carDto);

	ArrayList<CarDto> carsToCarDtos(ArrayList<Car> cars);

	ArrayList<Car> carDtosToCars(ArrayList<CarDto> carDtos);

	PersonDto personToPersonDto(Person person);

	Person personDtoToPerson(PersonDto personDto);

	ArrayList<PersonDto> personsToPersonDtos(ArrayList<Person> persons);

	ArrayList<Person> personDtosToPersons(ArrayList<PersonDto> personDtos);
}
