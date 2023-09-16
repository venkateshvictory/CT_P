package com.real.icrement.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.real.icrement.model.Customer;
import com.real.icrement.model.Item;
import com.real.icrement.service.Constants;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Repository("itemRepository")
public interface ItemRepository extends JpaRepository<Item, Long>{
	// @Query("Select u From CustomerRole u WHERE u.customer.emailAddress = :email")
	
	
	
	@Query(value ="Select u from Item u WHERE u.countrySubdivision.abbreviation = :abbreviation")
	public List<Item> findItemByCity(@Param("abbreviation") String abbreviation);

	
	@Query(value ="Select u from Item u WHERE u.countrySubdivision.abbreviation = :abbreviation")
	public Page<Item> findAll(Pageable pageable, @Param("abbreviation") String abbreviation);
	
	// here i have to modify 
	@Query(value = "Select u from Item u where u.createdBy=:customer")
	public List<Item> findByAgent(Customer customer);
	
	


}
	

			
	
	

