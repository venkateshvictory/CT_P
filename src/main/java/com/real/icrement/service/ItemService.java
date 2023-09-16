package com.real.icrement.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.real.icrement.model.Customer;
import com.real.icrement.model.Item;

public interface ItemService {

//	public List<Item> findItemByCity(String abbrevation);

	List<Item> findItemByCity(String abbrevation);
	
	public Page<Item> getPaginationForCity(int pageNo, int pageSize);

	Page<Item> getAlongWithPagination(String abbrevation, int pageNo, int pageSize);
	public List<Item> findByAgent(Customer customer);
	
}
