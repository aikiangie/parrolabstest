package com.parrolabs.test.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@IdClass(RequisitionDetailId.class)
@Table(name="requisition_detail")
public class RequisitionDetail implements Serializable{

	@Id
	private Long requisitionId;
	
	@Id
	private Long productId;
		
	@Column(unique = false, nullable = false)
	private Integer quantity;
	
	@Column(unique = false, nullable = false)
	private Float total;

	public Long getRequisitionId() {
		return requisitionId;
	}

	public void setRequisitionId(Long requisitionId) {
		this.requisitionId = requisitionId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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
