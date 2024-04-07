package com.adorno.model.unoauno;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
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
	@DBRef
	private Usuario usuario;

	public Contrato(String descripcion, Usuario usuario) {
		super();
		
		this.descripcion = descripcion;
		this.usuario = usuario;
	}

}
