package com.parrolabs.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.models.ShippingAddress;
import com.parrolabs.test.repository.ShippingAddressRepository;

@Service
public class ShippingAddressService {

	@Autowired
	private ShippingAddressRepository repository;
	
	public List<ShippingAddress> getAllShippingAddresss(){
		return repository.findAll();
	}
	
	public Long createShippingAddress(ShippingAddress shippingAddress) {
		return repository.save(shippingAddress).getId();
	}

	public ShippingAddress findShippingAddress(Long id) {
		return repository.getShippingAddressById(id);
	}
}
