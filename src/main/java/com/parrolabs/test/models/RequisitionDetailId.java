package com.parrolabs.test.models;

import java.io.Serializable;

public class RequisitionDetailId implements Serializable{
	 
	private Long requisitionId;
	private Long productId;
	
	public RequisitionDetailId(Long requisitionId, Long productId) {
        this.requisitionId = requisitionId;
        this.productId = productId;
    }
	
}
