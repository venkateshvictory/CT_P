package com.real.icrement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.Customer;
import com.real.icrement.model.CustomerRole;

@Repository("customerRepository")
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	// it is based on exact exact column name in model class or database
	//@Query(value = "Select * from Customer u where u.first_name=:firstName ", nativeQuery = true)
	
	// it is based on exact attribute name in model class
	@Query("SELECT u FROM Customer u WHERE u.firstName = :firstName")
	List<Customer> findByName(@Param("firstName") String firstName);
	
	@Query("SELECT U FROM Customer U WHERE U.emailAddress =:emailAddress")
	Customer findByEmail(@Param ("emailAddress") String emailAddress);
	
	
	@Query(value = "Select c.* from CUSTOMER c,CUSTOMER_ROLE r where c.id =r.id and c.EMAIL_ADDRESS=:EMAIL_ADDRESS",nativeQuery= true)
	public List<Customer> findByCustomer(@Param("EMAIL_ADDRESS") String email);
}
