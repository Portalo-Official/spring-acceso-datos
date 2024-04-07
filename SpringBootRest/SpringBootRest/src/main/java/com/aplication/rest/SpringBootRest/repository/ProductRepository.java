package com.aplication.rest.SpringBootRest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.aplication.rest.SpringBootRest.models.entities.Product;

import java.math.BigDecimal;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findByPriceBetween(BigDecimal minPrice, BigDecimal maxPrice);
	@Query("SELECT p FROM Product p WHERE p.price BETWEEN ?1 AND ?2")
	List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);
}
