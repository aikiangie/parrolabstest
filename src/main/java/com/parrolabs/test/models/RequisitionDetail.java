package com.parrolabs.test.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "requisition_detail")
public class RequisitionDetail{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "requisition_id")
	private Requisition requisition;

	@ManyToOne()
    @JoinColumn(name = "product_id")
	private Product product;

	@Column(unique = false, nullable = false)
	private Integer quantity;

	@Column(unique = false, nullable = false)
	private Float total;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Requisition getRequisition() {
		return requisition;
	}

	public void setRequisition(Requisition requisition) {
		this.requisition = requisition;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

}
