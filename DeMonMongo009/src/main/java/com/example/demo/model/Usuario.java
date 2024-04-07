package com.example.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
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
