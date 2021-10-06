package com.parrolabs.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parrolabs.test.models.Requisition;
import com.parrolabs.test.services.RequisitionService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private RequisitionService service;
	
	@GetMapping("/all")
	public List<Requisition> getAllRequisitions(){
		return service.getAllRequisitions();
	}
	
	@PostMapping("/create")
	public Long createRequisition(@RequestBody Requisition requisition){
		return service.createRequisition(requisition);
	}
	
	@GetMapping("/find/{id}")
	public Requisition findRequisition(@PathVariable Long id){
		return service.findRequisition(id);
	}

}
