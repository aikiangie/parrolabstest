package com.parrolabs.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parrolabs.test.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query("select p from Customer p where p.id=:id")
	Customer getCustomerById(@Param("id") Long id);

}
