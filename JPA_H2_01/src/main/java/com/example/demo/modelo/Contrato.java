package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String descripcion;
	@OneToOne
	private Persona persona;
	
	public Contrato() {
		
	}

	public Contrato(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	public Contrato(String descripcion, Persona persona) {
		this.descripcion = descripcion;
		this.persona = persona;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Long getId() {
		return id;
	}
	
}
