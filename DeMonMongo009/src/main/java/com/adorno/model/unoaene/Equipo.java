package com.adorno.model.unoaene;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.adorno.model.unoauno.Usuario;

import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "equipos")
@Data
@NoArgsConstructor
public class Equipo {
	@Id
	private String id;
	private String nonmbre;
	@DBRef
	private List<Persona> jugadores;
	
	public Equipo(String nonmbre, List<Persona> jugadores) {
		super();
		this.nonmbre = nonmbre;
		this.jugadores = jugadores;
	}
	
	
}
