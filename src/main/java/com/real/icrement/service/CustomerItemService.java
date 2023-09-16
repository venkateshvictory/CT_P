package com.real.icrement.service;

import org.springframework.data.repository.query.Param;

public interface CustomerItemService {

	

	
	public boolean hasAdminRole( Long itemId,  Long CustomerId);

}
