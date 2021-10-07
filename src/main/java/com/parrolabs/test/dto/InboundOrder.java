package com.parrolabs.test.dto;

import java.util.List;

public class InboundOrder {

	private String orderNumber;
	private String paymentType;
	private Long customer_id;
	private Long shippingAddress_id;
	private List<InboundOrderItem> requisitionDetail;

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

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public Long getShippingAddress_id() {
		return shippingAddress_id;
	}

	public void setShippingAddress_id(Long shippingAddress_id) {
		this.shippingAddress_id = shippingAddress_id;
	}

	public List<InboundOrderItem> getRequisitionDetail() {
		return requisitionDetail;
	}

	public void setRequisitionDetail(List<InboundOrderItem> requisitionDetail) {
		this.requisitionDetail = requisitionDetail;
	}

}
