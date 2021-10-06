package com.parrolabs.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.models.Product;
import com.parrolabs.test.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> getAllProducts(){
		return repository.findAll();
	}
	
	public Long createProduct(Product product) {
		return repository.save(product).getId();
	}

	public Product findProduct(Long id) {
		return repository.getProductById(id);
	}
}
