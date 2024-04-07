package com.jpa.SpringJpaRelation.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Club {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	// targetEntity digo la entiodad con la que se va a ahcer la relacion
	@OneToOne(targetEntity = Coach.class, cascade = CascadeType.PERSIST)
	// JoinColumn para renombrar Clave foranea ( No vale @Column)
	@JoinColumn(name = "id_coach")
	private Coach coach;
	
	/*
	 * fetch --> EAGER: Carga todos los jugadores al obtener el Club,
	 * 			 LAZY: Carga los jugadores cuando se pidan la lista de jugadores ( .getPlayers() )
	 * 
	 * mappedBy --> No crea tabla intermedia, mapea los datos en la clase jugadores atributo club.
	 */
	@OneToMany(targetEntity = Player.class,
			   fetch = FetchType.LAZY,
			   mappedBy = "club")
	private List<Player> players;
	
	@ManyToOne(targetEntity = FootballAssociation.class)
	@JoinColumn(name = "id_association")
	private FootballAssociation association;
	
	/*
	 * Aqui no habria que hacer un mappedBy porque JPA por defecto
	 * va a crear una tabla intermedia
	 * Esta tabla intermedia la vamos a renombrar con JoinTable:
	 *  joinColumns -> para definir el id de la clase actuial (Club en este caso)
	 *  inverseJoinColumns -> definir el id de la otra clase (FootBallCompetition)
	 */
	@ManyToMany(targetEntity = FootballCompetition.class, fetch = FetchType.LAZY)
	@JoinTable(name = "club_competition",
			   joinColumns = @JoinColumn(name = "club"),
			   inverseJoinColumns = @JoinColumn(name="competition"))
	private List<FootballCompetition> footballCompetitions;
}
