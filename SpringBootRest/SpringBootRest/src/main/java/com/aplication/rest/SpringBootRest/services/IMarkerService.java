package com.aplication.rest.SpringBootRest.services;

import java.util.List;
import java.util.Optional;

import com.aplication.rest.SpringBootRest.models.dtos.MakerDTO;
import com.aplication.rest.SpringBootRest.models.entities.Maker;

public interface IMarkerService {
	Optional<MakerDTO> getById(Long id);
	List<MakerDTO> getAll();
	void save(MakerDTO maker);
	void deleteById(Long id);
	Optional<MakerDTO> getByName(String name);
}
