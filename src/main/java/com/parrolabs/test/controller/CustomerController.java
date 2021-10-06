package com.parrolabs.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parrolabs.test.models.Customer;
import com.parrolabs.test.services.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	
	@PostMapping("/create")
	public Long createCustomer(@RequestBody Customer customer){
		return service.createCustomer(customer);
	}
	
	@GetMapping("/find/{id}")
	public Customer findCustomer(@PathVariable Long id){
		return service.findCustomer(id);
	}

}
