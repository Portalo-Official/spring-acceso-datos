package com.abrazo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrazo.entity.Alumno;
import com.abrazo.service.AlomnoService;

@RestController
@RequestMapping("alumnos")
public class alumnoController {

	private final AlomnoService alumService;

	public alumnoController(AlomnoService alumService) {
		super();
		this.alumService = alumService;
	}
	
	@PostMapping("crearAlumno")
	public Boolean postAlumno(@RequestBody Alumno alumno) {
		
		return this.alumService.add(alumno);
	}
	@GetMapping("crearAlumno")
	public String getAlumno() {
		
		return "Hola holita";
	}
	
	
	
}
