package com.aplication.rest.SpringBootRest.services.impl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.aplication.rest.SpringBootRest.models.entities.Product;
import com.aplication.rest.SpringBootRest.persistence.IProductDAO;
import com.aplication.rest.SpringBootRest.services.IProductService;
@Service
public class ProductService implements IProductService {
	
	private final IProductDAO productDAO;
	
	public ProductService(IProductDAO productDAO) {
		super();
		this.productDAO = productDAO;
	}

	@Override
	public List<Product> getAll() {
		return this.productDAO.findAll();
	}

	@Override
	public Optional<Product> getById(Long id) {
		return this.productDAO.findById(id);
	}

	@Override
	public void save(Product product) {
		this.productDAO.save(product);
	}

	@Override
	public void deleteById(Long id) {
		this.productDAO.deleteById(id);
	}

	@Override
	public List<Product> findByPriceInRangeJava8(BigDecimal min, BigDecimal max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPriceInRange(BigDecimal min, BigDecimal max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findByPriceInRangeQuery(BigDecimal min, BigDecimal max) {
		// TODO Auto-generated method stub
		return null;
	}

}
