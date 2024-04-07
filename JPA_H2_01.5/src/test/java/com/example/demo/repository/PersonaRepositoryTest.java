package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.repositories.PersonaRepository;

@SpringBootTest
class PersonaRepositoryTest {

	@Autowired
	PersonaRepository repository;
	
	@Test
	void test() {
		
	}

}
