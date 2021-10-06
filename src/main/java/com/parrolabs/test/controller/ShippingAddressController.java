package com.parrolabs.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parrolabs.test.models.ShippingAddress;
import com.parrolabs.test.services.ShippingAddressService;

@RestController
@RequestMapping("/shipping-address")
public class ShippingAddressController {

	@Autowired
	private ShippingAddressService service;
	
	@GetMapping("/all")
	public List<ShippingAddress> getAllShippingAddresss(){
		return service.getAllShippingAddresss();
	}
	
	@PostMapping("/create")
	public Long createShippingAddress(@RequestBody ShippingAddress shippingAddress){
		return service.createShippingAddress(shippingAddress);
	}
	
	@GetMapping("/find/{id}")
	public ShippingAddress findShippingAddress(@PathVariable Long id){
		return service.findShippingAddress(id);
	}

}
