package com.jpa.SpringJpaRelation.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "football_competition")
public class FootballCompetition {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "name", columnDefinition = "VARCHAR(300)")
	private String name;
	/**
	 * Parametros de @Column
	 * @length -> tamaño en caracteres maximos
	 * @nullable -> si se permite valores null ( false por defecto)
	 * @unique -> valor de campo unico, no puede haber otro igual
	 * @updatable -> si el campo se puede actualizar o no (true por defecto)
	 * @insertable -> Perimitir o no insertar valores en esa columna (true por defecto)
	 * @columnDefinition -> 
	 */
//	@Column(name = "cuantity_price", length = 10, nullable = false, updatable = false)
	@Column(name = "cuantity_price")
	private Integer cuantityPrice;
	// LocalDate to Date antes daba problema con JPA, esta bien que lo definamos en DATE
	@Column(name = "start_date", columnDefinition = "DATE")
	private LocalDate startDate;
	@Column(name = "end_date", columnDefinition = "DATE")
	private LocalDate endDate;
	@ManyToMany(targetEntity = FootballCompetition.class, fetch = FetchType.LAZY)
	private List<Club> clubs;
	
}
