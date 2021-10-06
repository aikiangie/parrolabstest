package com.parrolabs.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.parrolabs.test.models.ShippingAddress;

public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Long> {
	
	//@Query(value="select * from shipping_address p where p.id=:id", nativeQuery = true)
	@Query("select a from ShippingAddress a where a.id=:id")
	ShippingAddress getShippingAddressById(@Param("id") Long id);

}
