package com.aplication.rest.SpringBootRest.persistence.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplication.rest.SpringBootRest.models.entities.Maker;
import com.aplication.rest.SpringBootRest.persistence.IMakerDAO;
import com.aplication.rest.SpringBootRest.repository.MakerRepository;

@Component
public class MakerDAOImpl implements IMakerDAO{
	
	@Autowired
	private MakerRepository makerRepo;
	
	public MakerDAOImpl(MakerRepository makerRepo) {
		super();
		this.makerRepo = makerRepo;
	}

	@Override
	public Optional<Maker> findById(Long id) {
		
		return this.makerRepo.findById(id);
	}

	@Override
	public List<Maker> findAll() {
		return this.makerRepo.findAll();
	}

	@Override
	public void save(Maker maker) {
		
		this.makerRepo.save(maker);
		
	}

	@Override
	public void deleteById(Long id) {
		this.makerRepo.deleteById(id);
	}

	@Override
	public Optional<Maker> findByName(String name) {
		
		return this.makerRepo.findByNameIgnoreCase(name);
	}

}
