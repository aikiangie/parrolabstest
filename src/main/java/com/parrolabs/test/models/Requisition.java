package com.parrolabs.test.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="requisition")
public class Requisition {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
	private Long id;
	
	@Column(unique = false, nullable = false)
	private String orderNumber;
	
	//private DateTime date;
	
	@JoinColumn(name = "customer_id")
    @OneToOne(fetch = FetchType.LAZY)
	private Customer customer;
	
	@JoinColumn(name = "shipping_address_id")
    @OneToOne(fetch = FetchType.LAZY)
	private ShippingAddress shippingAddress;
	
	// (cash, credit card,  check, other)
	
	@Column(unique = false, nullable = false)
	private String paymentType;
	
	//list of products 
	
	@Column(unique = false, nullable = false)
	private Float totalOrderValue;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Float getTotalOrderValue() {
		return totalOrderValue;
	}

	public void setTotalOrderValue(Float totalOrderValue) {
		this.totalOrderValue = totalOrderValue;
	} 
	
	
}
