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
	
	
}	
