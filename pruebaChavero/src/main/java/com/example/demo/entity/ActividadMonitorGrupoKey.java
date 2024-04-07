package com.example.demo.entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ActividadMonitorGrupoKey implements Serializable{

	private static final long serialVersionUID = 1L;
	private Grupo grupo;
	private Monitor monitor;
	private Actividad actividad;
	private LocalDate fecha;
	
}
