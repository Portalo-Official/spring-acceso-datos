package com.aplication.rest.SpringBootRest.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.aplication.rest.SpringBootRest.models.mappers.MapperMaker;

@Component
public class MapperConfiguration {

	@Bean
	MapperMaker getMapperMaker() {
		return new MapperMaker();
	}
	
}
