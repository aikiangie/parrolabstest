package com.parrolabs.test.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.dto.InboundCustomer;
import com.parrolabs.test.models.Customer;
import com.parrolabs.test.models.ShippingAddress;
import com.parrolabs.test.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	public Customer createCustomer(InboundCustomer inboundCustomer) {

		Customer customer = inboundCustomer.getCustomer();
		ShippingAddress shippingAddress = inboundCustomer.getPrimaryShippingAddress();

		shippingAddress.setCustomer(customer);
		shippingAddress.setPrimary(true);
		
		customer.setShippingAddress(new ArrayList<>());
		customer.getShippingAddress().add(shippingAddress);

		customerRepository.save(inboundCustomer.getCustomer());
		
		return customer;
		
	}

	public Customer findCustomer(Long id) {
		return customerRepository.getCustomerById(id);
	}
}
