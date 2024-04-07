package com.example.demo.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Egb {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	@OneToOne
	private Cabania cabania;
	
	public Egb(String nombre, Cabania cabania) {
		super();
		this.nombre = nombre;
		this.cabania = cabania;
	}

	public Egb() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cabania getCabania() {
		return cabania;
	}

	public void setCabania(Cabania cabania) {
		this.cabania = cabania;
	}

	public Long getId() {
		return id;
	}
	
	
	
	
}
