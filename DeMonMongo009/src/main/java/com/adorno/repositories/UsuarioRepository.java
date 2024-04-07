package com.adorno.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.adorno.model.unoauno.Usuario;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
	Optional<Usuario> findByNombre(String nombre);
}
