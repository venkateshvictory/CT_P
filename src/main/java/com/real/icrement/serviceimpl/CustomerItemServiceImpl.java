package com.real.icrement.serviceimpl;

import org.springframework.stereotype.Service;

import com.real.icrement.service.CustomerItemService;
@Service("customerItemService")
public class CustomerItemServiceImpl implements CustomerItemService{

	

	@Override
	public boolean hasAdminRole(Long itemId, Long customerId) {
		
		return false;
	}

}
