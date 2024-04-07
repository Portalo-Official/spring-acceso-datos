package com.aplication.rest.SpringBootRest.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aplication.rest.SpringBootRest.models.dtos.MakerDTO;
import com.aplication.rest.SpringBootRest.models.entities.Maker;
import com.aplication.rest.SpringBootRest.models.mappers.MapperMaker;
import com.aplication.rest.SpringBootRest.persistence.IMakerDAO;
import com.aplication.rest.SpringBootRest.services.IMarkerService;

@Service
public class MarkerServiceImpl implements IMarkerService {
	private final MapperMaker mapMaker;
	private final IMakerDAO makeDAO;
	
	

	public MarkerServiceImpl(MapperMaker mapMaker, IMakerDAO makeDAO) {
		super();
		this.mapMaker = mapMaker;
		this.makeDAO = makeDAO;
	}

	@Override
	public Optional<MakerDTO> getById(Long id) {
		return Optional.of(this.mapMaker.mapToDTO(this.makeDAO.findById(id).get()));
	}

	@Override
	public List<MakerDTO> getAll() {	
		return this.makeDAO.findAll().stream()
									.map( m -> this.mapMaker.mapToDTO(m))
									.toList();	
	}

	@Override
	public void save(MakerDTO maker) {
		if( this.makeDAO.findByName(maker.getNombre()).isEmpty())
		this.makeDAO.save(this.mapMaker.mapToEntity(maker));
	}

	@Override
	public void deleteById(Long id) {
		this.makeDAO.deleteById(id);
	}

	@Override
	public Optional<MakerDTO> getByName(String name) {
		return Optional.of(this.mapMaker.mapToDTO(this.makeDAO.findByName(name).get()));
	}

}
