package com.real.icrement.service;

import java.util.List;

import com.real.icrement.model.CustomerRole;

public interface CustomerRoleService {

	public List<CustomerRole> findByCustomer(String email);
	
	public CustomerRole save(CustomerRole customerRole);
	
	public boolean hasAdminRole(String email);
	
	public boolean hasAgentRole(String email);
	
}
