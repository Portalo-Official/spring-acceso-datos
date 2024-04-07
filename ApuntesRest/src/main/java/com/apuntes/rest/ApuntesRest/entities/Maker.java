package com.apuntes.rest.ApuntesRest.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "fabricantes")
public class Maker {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre", columnDefinition = "VARCHAR(150)")
	private String name;
	
	/* 
	 * @orphanRemoval = true -> si se borra un Maker, se borran sus productos
	 * mappedBy -> crea como clave foranea la clase Maker indicando el nombre del atributo maker de Product
	 */
	@OneToMany(mappedBy = "maker",
			   cascade = CascadeType.ALL,
			   fetch = FetchType.LAZY,
			   orphanRemoval = true)
	private List<Product>  products;
	
}
