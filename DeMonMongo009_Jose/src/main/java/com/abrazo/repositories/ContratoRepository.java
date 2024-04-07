package com.abrazo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.abrazo.model.Contrato;
import com.abrazo.model.Usuario;
@Repository
public interface ContratoRepository extends MongoRepository<Contrato, String>  {
	public Optional<Contrato> findByUsuario(Usuario usuario);
}
