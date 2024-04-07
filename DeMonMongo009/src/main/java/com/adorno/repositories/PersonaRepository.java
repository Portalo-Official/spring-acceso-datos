package com.adorno.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.unoaene.Persona;

public interface PersonaRepository extends MongoRepository<Persona, String> {

}
