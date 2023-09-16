package com.real.icrement.serviceimpl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.real.icrement.model.Customer;
import com.real.icrement.model.Item;
import com.real.icrement.repository.ItemRepository;
import com.real.icrement.service.ItemService;

import jakarta.annotation.Resource;
@Service("itemService")
public class ItemServiceImpl implements ItemService {

	@Resource(name="itemRepository")
	private ItemRepository itemRepository;

	@Override
	public List<Item> findItemByCity(String abbrevation) {
		
		return itemRepository.findItemByCity(abbrevation);
	}
	
	public Page<Item> getPaginationForCity(int pageNo, int pageSize){
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return itemRepository.findAll(pageable);
	}

	@Override
	public Page<Item> getAlongWithPagination(String abbrevation, int pageNo, int pageSize) {
		Pageable pageable = PageRequest.of(pageNo, pageSize);
		return itemRepository.findAll(pageable,abbrevation);
	}

	@Override
	public List<Item> findByAgent(Customer customer) {
		Long customerID=customer.getId();
		return itemRepository.findByAgent(customer);
	}

	
	
}


//@Override
//public Page<ProductContent> getCustomers(int pageNo, int pageSize) {
//	Pageable pageable =PageRequest.of(pageNo, pageSize);
//	return productContentDao.findAll(pageable);