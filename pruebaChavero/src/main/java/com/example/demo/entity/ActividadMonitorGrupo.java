package com.example.demo.entity;


import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(value = ActividadMonitorGrupoKey.class)
public class ActividadMonitorGrupo {
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Actividad actividad;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Monitor monitor;
	
	@Id
	@ManyToOne(cascade = CascadeType.ALL)
	private Grupo grupo;
	
	@Id
	private LocalDate  fecha;
	
}
