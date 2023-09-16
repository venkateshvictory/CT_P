package com.real.icrement.serviceimpl;

import java.util.List;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.real.icrement.component.CustomerState;
import com.real.icrement.model.Customer;
import com.real.icrement.model.CustomerRole;
import com.real.icrement.repository.CustomerRepository;
import com.real.icrement.service.CustomerService;

import jakarta.annotation.Resource;
import jakarta.transaction.Transactional;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Resource(name = "customerRepository")
	private CustomerRepository customerRepository;

	@Override
	@Transactional
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer currentCustomer() {

		Customer customer = CustomerState.getCustomer();
		customer.setPassword(null);
		return customer;
	}

	@Override
	public Customer findById(Long id) {

		Optional<Customer> optional = customerRepository.findById(id);
		if (optional.isPresent()) {
			Customer cust = optional.get();
			return cust;
		} else
			return null;
	}

	@Override
	public List<Customer> findByName(String firstName) {
		
		return customerRepository.findByName(firstName);
	}

	@Override
	public boolean hasAdminRole(String email) {
		
		return false;
	}

	@Override
	public List<Customer> findByCustomer(String email) {
		return customerRepository.findByCustomer(email);
	}

	@Override
	public Customer findByEmail(String email) {
		return customerRepository.findByEmail(email);
	}

}
