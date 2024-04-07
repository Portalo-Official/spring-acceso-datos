package com.example.demo.modelos;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Tienda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nombre;
	@OneToMany
	private List<Eso> ninios= new ArrayList<>();

	public Tienda(String nombre, List<Eso> ninios) {
		super();
		this.nombre = nombre;
		this.ninios = ninios;
	}

	public Tienda() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Eso> getNinios() {
		return ninios;
	}

	public void setNinios(List<Eso> ninios) {
		this.ninios = ninios;
	}

	public Long getId() {
		return id;
	}
	
	
	
}
