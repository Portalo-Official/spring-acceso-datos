package com.adorno.model.unoaene;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "personas")
public class Persona {
	@Id
	private String id;
	@Indexed(unique = true)
	private String nombre;
	private String email;
	public Persona(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.email = email;
	}
	
	
}
