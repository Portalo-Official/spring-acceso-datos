package com.abrazo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abrazo.model.Usuario;
@Repository
public interface UsuarioRepository  extends MongoRepository<Usuario, String>{

}
