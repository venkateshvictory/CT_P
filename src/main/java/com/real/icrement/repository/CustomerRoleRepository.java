package com.real.icrement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.CustomerRole;

@Repository("customerRoleRepository")
public interface CustomerRoleRepository extends JpaRepository<CustomerRole, Long> {
	// Hql queries
	// https://www.baeldung.com/spring-data-jpa-query

      @Query("Select u From CustomerRole u WHERE u.customer.emailAddress = :email")
	
	//@Query(value = "Select r.* from CUSTOMER c,CUSTOMER_ROLE r where c.id =r.id and c.EMAIL_ADDRESS=:email",nativeQuery= true)
      //Select c.* from school.CUSTOMER c, school.CUSTOMER_ROLE r where c.id =r.id and c.EMAIL_ADDRESS="doddivenkatesh7@gmail.com";
	public List<CustomerRole> findByCustomer(@Param("email") String email);
 
	
}
