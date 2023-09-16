package com.real.icrement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;

import com.real.icrement.model.Customer;
import com.real.icrement.model.CustomerRole;

public interface CustomerService {

	public Customer save(Customer customer);
	public Customer currentCustomer();
	Customer findById(Long id);
	
	List<Customer> findByName(String firstName);
	
	public boolean hasAdminRole(String email);
	
	public List<Customer> findByCustomer(String email);
	
	public Customer findByEmail(String email);
	
	
}
