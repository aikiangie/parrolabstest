package com.parrolabs.test.dto;

import com.parrolabs.test.models.Customer;
import com.parrolabs.test.models.ShippingAddress;

public class InboundCustomer {

	private Customer customer;
	private ShippingAddress primaryShippingAddress;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getPrimaryShippingAddress() {
		return primaryShippingAddress;
	}

	public void setPrimaryShippingAddress(ShippingAddress primaryShippingAddress) {
		this.primaryShippingAddress = primaryShippingAddress;
	}

}
