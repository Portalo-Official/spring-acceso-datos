package com.abrazo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
//anotacion que lo convierte en un document
@Document(collection = "usuarios")
public class Usuario {

	@Id
	private String id;
	private String nombre;
	private String email;

	public Usuario(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}

}
