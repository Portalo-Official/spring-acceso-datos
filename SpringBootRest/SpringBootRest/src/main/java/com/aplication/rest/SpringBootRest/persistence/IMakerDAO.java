package com.aplication.rest.SpringBootRest.persistence;

import java.util.List;
import java.util.Optional;

import com.aplication.rest.SpringBootRest.models.entities.Maker;

public interface IMakerDAO {
	Optional<Maker> findById(Long id);
	List<Maker> findAll();
	void save(Maker maker);
	void deleteById(Long id);
	Optional<Maker> findByName(String name);
}
