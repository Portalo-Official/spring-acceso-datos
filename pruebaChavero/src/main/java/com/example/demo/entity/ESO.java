package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false) // PAra que @Dta no se raye
public class ESO extends Ninio {
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	private Long ESO_id;
	@ManyToOne
	private Tienda tienda;
	
}
