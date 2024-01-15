package com.example.demo.trepositories;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Persona;
import com.example.demo.repositories.PersonaRepository;

@SpringBootTest
class PersonaRepositoryTest {
	@Autowired
	PersonaRepository personaRepository;
	
	@Test
	void test() {
		Persona persona = new Persona("Joaquin", "Sabina");
		personaRepository.save(persona);
		
	
	}

}
