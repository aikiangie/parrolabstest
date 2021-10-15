package com.parrolabs.test.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.dto.InboundOrder;
import com.parrolabs.test.dto.InboundOrderItem;
import com.parrolabs.test.models.Product;
import com.parrolabs.test.models.Requisition;
import com.parrolabs.test.models.RequisitionDetail;
import com.parrolabs.test.repository.CustomerRepository;
import com.parrolabs.test.repository.RequisitionRepository;
import com.parrolabs.test.repository.ShippingAddressRepository;

@Service
public class RequisitionService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ProductService productService;

	@Autowired
	private ShippingAddressRepository shippingAddressRepository;

	@Autowired
	private RequisitionRepository requisitionRepository;

	public List<Requisition> getAllRequisitions() {
		return requisitionRepository.findAll();
	}

	public Requisition createRequisition(InboundOrder inboundOrder) {

		Requisition requisition = new Requisition();

		requisition.setOrderNumber(inboundOrder.getOrderNumber());
		requisition.setCustomer(customerRepository.getCustomerById(inboundOrder.getCustomer_id()));
		requisition.setDate(new Date());
		requisition.setShippingAddress(
				shippingAddressRepository.getShippingAddressById(inboundOrder.getShippingAddress_id()));
		requisition.setPaymentType(inboundOrder.getPaymentType());
		requisition.setTotalOrderValue(0f);
		
		requisitionRepository.save(requisition);
		
		Float total = 0f;

		requisition.setRequisitionDetail(new ArrayList<RequisitionDetail>());

		for (InboundOrderItem inorder : inboundOrder.getRequisitionDetail()) {

			RequisitionDetail detail = new RequisitionDetail();
			Product product = productService.findProduct(inorder.getProduct_id());
			detail.setRequisition(requisition);
			detail.setProduct(product);
			detail.setQuantity(inorder.getQuantity());
			detail.setTotal(product.getPrice() * inorder.getQuantity());
			requisition.getRequisitionDetail().add(detail);

			total += detail.getTotal();
		}


		requisition.setTotalOrderValue(total);

		return requisitionRepository.save(requisition);

	}

	public Requisition findRequisition(Long id) {
		return requisitionRepository.getRequisitionById(id);
	}
}
