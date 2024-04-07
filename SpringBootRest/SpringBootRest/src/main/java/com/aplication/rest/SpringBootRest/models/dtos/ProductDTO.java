package com.aplication.rest.SpringBootRest.models.dtos;

import java.math.BigDecimal;

import com.aplication.rest.SpringBootRest.models.entities.Maker;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductDTO {
	
	private String name;
	
	private BigDecimal price;
	
	private MakerDTO makerDTO;
}
