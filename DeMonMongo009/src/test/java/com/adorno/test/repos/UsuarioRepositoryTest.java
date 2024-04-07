package com.adorno.test.repos;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.adorno.model.unoauno.Contrato;
import com.adorno.model.unoauno.Usuario;
import com.adorno.repositories.ContratoRepository;
import com.adorno.repositories.UsuarioRepository;

@SpringBootTest
class UsuarioRepositoryTest {

	@Autowired
	UsuarioRepository usuarioRepository;
	@Autowired
	ContratoRepository contratoRepository;

	@BeforeEach
	void bef() {
		contratoRepository.deleteAll();
		usuarioRepository.deleteAll();
	}

	@Test
	void test() {
		String nombre = "Arturito";
		usuarioRepository.save(new Usuario(nombre, "hh"));
		// sin fallo pero sin cascada
		Contrato contrato = new Contrato("hogar", usuarioRepository.findByNombre(nombre).get());
		contratoRepository.save(contrato);

	}

}
