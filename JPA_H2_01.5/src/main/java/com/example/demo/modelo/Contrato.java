package com.example.demo.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Contrato {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
}
