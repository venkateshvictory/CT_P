package com.real.icrement.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amazonaws.util.CollectionUtils;
import com.real.icrement.baseEndpoint.ResponseDTO;
import com.real.icrement.model.CustomerRole;
import com.real.icrement.repository.CustomerRoleRepository;
import com.real.icrement.service.CustomerRoleService;

import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;

@Service("customerRoleService")
public class CustomerRoleServiceImpl implements CustomerRoleService {

	@Resource(name = "customerRoleRepository")
	private CustomerRoleRepository customerRoleRepository;

	@Override
	public List<CustomerRole> findByCustomer(String email) {

		List<CustomerRole> customer = customerRoleRepository.findByCustomer(email);
		return customer;

	}

	@Override
	@Transactional
	public CustomerRole save(CustomerRole customerRole) {

		return customerRoleRepository.save(customerRole);
	}

	@Override
	public boolean hasAdminRole(String email) {
		
	    List<CustomerRole> customerRoles=customerRoleRepository.findByCustomer(email);
	     if(CollectionUtils.isNullOrEmpty(customerRoles)) {
	    	 return false;
	     }
		for(CustomerRole customerRole :customerRoles) {
			if(customerRole.getRoleName().equals("ROLE_ADMIN")) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean hasAgentRole(String email) {
	        List<CustomerRole> customerRoles=customerRoleRepository.findByCustomer(email);
	        if(CollectionUtils.isNullOrEmpty(customerRoles)) {
	        	return false;
	        }
	        for(CustomerRole customerRole:customerRoles) {
	        	if(customerRole.getRoleName().equals("ROLE_AGENT")) {
	        		return true;
	        	}
	        }
		return false;
	}
	
	
}