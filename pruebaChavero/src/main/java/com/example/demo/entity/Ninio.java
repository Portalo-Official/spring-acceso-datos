package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data // Getters Setters
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED) // Heredar
public abstract class Ninio {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numero_inscripcion;
	private String nombre;
	private String apellidos;
	private String direccion;
	private int edad;
	@ManyToOne
	private Grupo grupo;
	
	
	
}
