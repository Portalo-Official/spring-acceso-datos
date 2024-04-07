package com.abrazo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.abrazo.entity.Alumno;
import com.abrazo.service.AlomnoService;

@SpringBootTest
class alomnoServiceTest {
	
	@Autowired
	AlomnoService alumService;
	
	@Test
	void test() {
		Alumno manolo = new  Alumno(1L, "Antonio");
		
		this.alumService.add(manolo);
		
		List<Alumno> alumnos = this.alumService.findAll();
		
		assertTrue(alumnos!= null);
		assertTrue(alumnos.size()>0);
		
		List<Alumno> losManolos = this.alumService.getByName("Antonio");
		
		losManolos.forEach(a -> System.err.println((a.toString())));
	}

}
