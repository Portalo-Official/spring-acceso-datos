package com.aplication.rest.SpringBootRest.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aplication.rest.SpringBootRest.models.entities.Maker;
import java.util.List;


@Repository
public interface MakerRepository extends JpaRepository<Maker, Long> {
	Optional<Maker> findByNameIgnoreCase(String name);
}
