package com.adorno.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.unoaene.Equipo;

public interface EquipoRepository extends MongoRepository<Equipo, String> {

}
