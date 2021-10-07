package com.parrolabs.test.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(unique = false, nullable = false)
	private Date date;
	
	/*@JsonIgnore
	@OneToOne(mappedBy = "requisition")
	private Customer customer;
	
	@JoinColumn(name = "shipping_address_id")
    @OneToOne(fetch = FetchType.LAZY)
	private ShippingAddress shippingAddress;*/
	
	// TODO: add validation for type (cash, credit card,  check, other)
	@Column(unique = false, nullable = false)
	private String paymentType;
	
	@Column(unique = false, nullable = false)
	private Float totalOrderValue;
	
	/*
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "id")
    private List<RequisitionDetail> requisitionDetail;
    */
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
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
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
