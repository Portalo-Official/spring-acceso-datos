package com.aplication.rest.SpringBootRest.models.mappers;

public interface MakerMapper<T , DTO> {
	DTO mapToDTO(T t);
	T mapToEntity(DTO dto);
}
