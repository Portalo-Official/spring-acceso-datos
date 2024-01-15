package com.example.demo.trepositories;


import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.modelo.Contrato;
import com.example.demo.modelo.Persona;
import com.example.demo.repositories.ContratoRepository;
import com.example.demo.repositories.PersonaRepository;

@SpringBootTest
class ContratoRepositoryTest {

	@Autowired
	ContratoRepository contratoRepository;
	@Autowired 
	PersonaRepository personaRepository;
	
	@Test
	void test() {
		// Error por que primero se debe tener la persona guardada en la BBDD
//		contratoRepository.save(new Contrato("vida multiple", new Persona("Joaquin", "Sabina")));

		Persona persona = new Persona("Ramon", "Cigala");
		personaRepository.save(persona);
		
		Optional<Persona> buscada = personaRepository.findById(1L);
		
		if(buscada.isPresent() ) {
			
			contratoRepository.save(new Contrato("vida multiple", buscada.get()));
		}
		
	}

}
