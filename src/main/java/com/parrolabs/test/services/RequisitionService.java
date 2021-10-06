package com.parrolabs.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parrolabs.test.models.Requisition;
import com.parrolabs.test.repository.RequisitionRepository;

@Service
public class RequisitionService {

	@Autowired
	private RequisitionRepository repository;
	
	public List<Requisition> getAllRequisitions(){
		return repository.findAll();
	}
	
	public Long createRequisition(Requisition requisition) {
		return repository.save(requisition).getId();
	}

	public Requisition findRequisition(Long id) {
		return repository.getRequisitionById(id);
	}
}
