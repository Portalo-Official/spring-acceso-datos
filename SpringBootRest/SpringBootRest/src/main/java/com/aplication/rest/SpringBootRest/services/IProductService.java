package com.aplication.rest.SpringBootRest.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import com.aplication.rest.SpringBootRest.models.entities.Product;

public interface IProductService {
	List<Product> getAll();
	Optional<Product> getById(Long id);
	void save(Product product);
	void deleteById(Long id);
	List<Product> findByPriceInRangeJava8(BigDecimal min, BigDecimal max);
	List<Product> findByPriceInRange(BigDecimal min, BigDecimal max);
	List<Product> findByPriceInRangeQuery(BigDecimal min, BigDecimal max);
}
