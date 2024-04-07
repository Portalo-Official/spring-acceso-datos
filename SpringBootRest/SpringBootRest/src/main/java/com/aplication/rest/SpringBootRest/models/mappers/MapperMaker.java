package com.aplication.rest.SpringBootRest.models.mappers;

import com.aplication.rest.SpringBootRest.models.dtos.MakerDTO;
import com.aplication.rest.SpringBootRest.models.entities.Maker;
 
public class MapperMaker implements MakerMapper<Maker, MakerDTO> {

	@Override
	public MakerDTO mapToDTO(Maker t) {
		return new MakerDTO().builder().nombre(t.getName()).build();
	}

	@Override
	public Maker mapToEntity(MakerDTO dto) {
		return new Maker().builder().name(dto.getNombre()).build();
	}

}
