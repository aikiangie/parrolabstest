package com.parrolabs.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.models.Customer;
import com.parrolabs.test.repository.CustomerRepository;
import com.parrolabs.test.repository.ShippingAddressRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ShippingAddressRepository shippingAddressRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Long createCustomer(Customer customer) {

		if (customer.getPrimaryShippingAddress() != null) {
			shippingAddressRepository.save(customer.getPrimaryShippingAddress());
		}

		return customerRepository.save(customer).getId();
	}

	public Customer findCustomer(Long id) {
		return customerRepository.getCustomerById(id);
	}
}
