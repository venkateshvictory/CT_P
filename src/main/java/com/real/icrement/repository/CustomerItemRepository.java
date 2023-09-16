package com.real.icrement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.real.icrement.model.CustomerItem;

public interface CustomerItemRepository extends JpaRepository<CustomerItem, Long>{
	//@Query("Select u From CustomerRole u WHERE u.customer.emailAddress = :email")
   	@Query("Select u from CustomerItem u where item.id= :itemId and customer.id =:customerId")
	public boolean hasAdminRole(@Param("itemId") Long itemId, @Param("customerId") Long CustomerId);
}
