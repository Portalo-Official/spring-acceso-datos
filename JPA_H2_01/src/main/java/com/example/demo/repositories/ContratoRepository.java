package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.modelo.Contrato;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {

}
