package com.abrazo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abrazo.entity.Alumno;
import com.abrazo.repository.AlumnoRepository;
@Service
public class AlomnoService {
	
	private final AlumnoRepository alumnoRepo;

	public AlomnoService(AlumnoRepository alumnoRepo) {
		this.alumnoRepo = alumnoRepo;
	}
	
	public List<Alumno> findAll() {
		
		return this.alumnoRepo.findAll();
	}
	
	
	public Alumno getByID( Long id) {
		Optional<Alumno> alumno = this.alumnoRepo.findById(id).ofNullable(null);
		return alumno.get();
	}
	
	public Boolean add(Alumno alumno) {
		try {
			this.alumnoRepo.save(alumno);
			return true;
		}catch (Exception e) {

		}
		return false;
	}
	
	public List<Alumno> getByName(String name){
		return this.alumnoRepo.findByName(name);
	}
	
}
