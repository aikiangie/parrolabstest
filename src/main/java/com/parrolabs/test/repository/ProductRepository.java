package com.parrolabs.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parrolabs.test.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	@Query("select p from Product p where p.id=:id")
	Product getProductById(@Param("id") Long id);

}
