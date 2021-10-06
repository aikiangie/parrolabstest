package com.parrolabs.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.models.Customer;
import com.parrolabs.test.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repository;
	
	public List<Customer> getAllCustomers(){
		return repository.findAll();
	}
	
	public Long createCustomer(Customer customer) {
		return repository.save(customer).getId();
	}

	public Customer findCustomer(Long id) {
		return repository.getCustomerById(id);
	}
}
