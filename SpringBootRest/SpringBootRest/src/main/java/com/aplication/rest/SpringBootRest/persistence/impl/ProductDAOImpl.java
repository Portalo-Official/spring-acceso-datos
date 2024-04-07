package com.aplication.rest.SpringBootRest.persistence.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aplication.rest.SpringBootRest.models.entities.Product;
import com.aplication.rest.SpringBootRest.persistence.IProductDAO;
import com.aplication.rest.SpringBootRest.repository.ProductRepository;

@Component
public class ProductDAOImpl implements IProductDAO {
	
	@Autowired
	private ProductRepository productRepo;
	
	public ProductDAOImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public List<Product> findAll() {
		return this.productRepo.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return this.findById(id);
	}

	@Override
	public void save(Product product) {
		this.productRepo.save(product);
	}

	@Override
	public void deleteById(Long id) {
		this.productRepo.deleteById(id);
	}

	@Override
	public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
		return this.productRepo.findByPriceBetween(min, max);
	}

	@Override
	public List<Product> findByPriceInRangeJava8(BigDecimal min, BigDecimal max) {
		return this.findAll().stream()
				.filter(p -> p.getPrice().compareTo(min)>=0 && p.getPrice().compareTo(max)<=0)
				.collect(Collectors.toList());
	}

	@Override
	public List<Product> findByPriceInRangeQuery(BigDecimal min, BigDecimal max) {
		
		return this.productRepo.findByPriceInRange(min, max);
	}
	
}
