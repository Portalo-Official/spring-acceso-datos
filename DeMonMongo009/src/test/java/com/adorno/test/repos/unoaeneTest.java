package com.adorno.test.repos;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.adorno.model.unoaene.Equipo;
import com.adorno.model.unoaene.Persona;
import com.adorno.repositories.EquipoRepository;
import com.adorno.repositories.PersonaRepository;

@SpringBootTest
class unoaeneTest {
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	EquipoRepository equipoRepository;
	@Autowired
	MongoTemplate mongoTemplate;

	@Test
	void test() {
		mongoTemplate.getCollection("personas").drop();
		mongoTemplate.getCollection("equipos").drop();
		Persona persona = new Persona("Anselmo", "algo@cosa.com");
		Persona save = personaRepository.save(persona);
		personaRepository.save(new Persona("Tiburcio", "algo@cosa.com"));
		personaRepository.save(new Persona("Esteban", "algo@cosa.com"));
		personaRepository.save(new Persona("Rodrigo", "algo@cosa.com"));
		System.out.println();
		equipoRepository.save(new Equipo("gladiadores del jpa", personaRepository.findAll()));
	}

}
