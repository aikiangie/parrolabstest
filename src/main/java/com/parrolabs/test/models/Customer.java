package com.parrolabs.test.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(unique = false, nullable = false)
	private String phone;

	@Column(unique = true, nullable = false)
	private String email;

	@JoinColumn(name = "primary_shipping_address_id", referencedColumnName = "id")
	@OneToOne(cascade = CascadeType.ALL)
	private ShippingAddress primaryShippingAddress;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ShippingAddress getPrimaryShippingAddress() {
		return primaryShippingAddress;
	}

	public void setPrimaryShippingAddress(ShippingAddress primaryShippingAddress) {
		this.primaryShippingAddress = primaryShippingAddress;
	}

}
