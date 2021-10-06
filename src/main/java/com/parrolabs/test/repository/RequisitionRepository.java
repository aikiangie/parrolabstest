package com.parrolabs.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parrolabs.test.models.Requisition;

public interface RequisitionRepository extends JpaRepository<Requisition, Long> {
	
	@Query("select p from Requisition p where p.id=:id")
	Requisition getRequisitionById(@Param("id") Long id);

}
