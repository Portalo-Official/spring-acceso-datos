package com.abrazo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "contratos")
public class Contrato {
	@Id
	private String id;
	private String descripcion;
	private Usuario usuario;

	public Contrato(String id, String descripcion, Usuario usuario) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.usuario = usuario;
	}

}
