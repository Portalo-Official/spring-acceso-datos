package com.abrazo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abrazo.entity.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno , Long>{
	List<Alumno> findByName(String name);
}
