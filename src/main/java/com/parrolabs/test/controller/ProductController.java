package com.parrolabs.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parrolabs.test.models.Product;
import com.parrolabs.test.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@GetMapping("/all")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@PostMapping("/create")
	public Long createProduct(@RequestBody Product product){
		return service.createProduct(product);
	}
	
	@GetMapping("/find/{id}")
	public Product findProduct(@PathVariable Long id){
		return service.findProduct(id);
	}

}
