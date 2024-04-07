package com.adorno.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adorno.modelo.Dimension;
import com.adorno.repositorio.IDimensionRepositorio;

@Service
public class DimensionService implements Services<Dimension> {

	private final IDimensionRepositorio dimensionRepo;

	public DimensionService(IDimensionRepositorio dimesionRepo) {
		super();
		this.dimensionRepo = dimesionRepo;
	}

	@Override
	public boolean add(Dimension dimension) {
//		return dimensionRepo.save(dimension) != null;
		if(dimensionRepo.findAll().stream().noneMatch(dim -> dim.equals(dimension))) {
			return this.dimensionRepo.save(dimension) != null;
		}
		

		return false;
	}

	@Override
	public boolean delete(long id) {
		boolean retorno = dimensionRepo.findById(id).isPresent();
		if (retorno) {
			dimensionRepo.findById(id).ifPresent((dimension) -> {
				dimensionRepo.delete(dimension);
			});
		}
		return retorno;
	}

	@Override
	public Optional<Dimension> getById(long id) {
		return dimensionRepo.findById(id);
	}

	@Override
	public List<Dimension> findAll() {
		return dimensionRepo.findAll();
	}

	@Override
	public boolean addAll(List<Dimension> insertados) {

		insertados.stream().forEach((dimension) -> {
			if (!dimensionRepo.findAll().contains(dimension))
				dimensionRepo.save(dimension);
		});

		return true;
	}

}
