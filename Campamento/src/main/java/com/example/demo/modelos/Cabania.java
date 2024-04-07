package com.example.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cabania {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	@OneToMany
	private List<Egb> ninios= new ArrayList<>();
	
	
	public Cabania() {
		super();
	}


	public Cabania( String nombre, List<Egb> ninios) {
		super();
		this.nombre = nombre;
		this.ninios = ninios;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public List<Egb> getNinios() {
		return ninios;
	}


	public void setNinios(List<Egb> ninios) {
		this.ninios = ninios;
	}


	public Long getId() {
		return id;
	}

	
	
	 
	
}
