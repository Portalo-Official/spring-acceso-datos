package com.adorno.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovilResumenDTO {

	//la id es para saber que movil es, no es que sea la Id del DTO
	
	private String modelo;
	private String marca;
	private int nucleosProcesador;
	private int almacenamiento_gb;
	private int ram;
	private float precio;
	
	
	
	
}
