package com.real.icrement.cart;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.dto.ItemDTO;
import com.real.icrement.listdata.ItemListData;
import com.real.icrement.listdto.ItemListDTO;
import com.real.icrement.model.Customer;
import com.real.icrement.model.Item;
import com.real.icrement.service.Constants;
import com.real.icrement.service.CustomerService;
import com.real.icrement.service.ItemService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/item")
public class ItemController {

	@Resource(name = "itemService")
	private ItemService itemService;

	@Autowired
	private ModelMapper modelMapper;

	@Resource(name = "customerService")
	private CustomerService customerService;

	/*
	 * @GetMapping("{abbrivation}") public ItemListDTO
	 * findJTItemByAbbrevation(@PathVariable("abbrivation") String abbrivation,
	 * HttpServletRequest request) {
	 * 
	 * }
	 */
//	select * from school.item order by region,id
//	limit 10
//	offset 1

	@GetMapping("find/{abbrevation}")
	public List<Item> findItemByCity(@PathVariable("abbrevation") String abbrevation) {
		List<Item> abbr = itemService.findItemByCity(abbrevation);
		return abbr;
	}

	@GetMapping("/pagination")
	public Page<Item> getByCityByPagination(@RequestParam /* (required=false, defaultValue ="0") */ int pageNo,
			@RequestParam /* (required=false,defaultValue="10") */ int pageSize) {
		return itemService.getPaginationForCity(pageNo, pageSize);
	}

	@GetMapping("pagination/{abbrevation}")
	public Page<Item> findItemByCity(@RequestParam("abbrevation") String abbrevation, @RequestParam int pageNo,
			@RequestParam int pageSize) {

		return itemService.getAlongWithPagination(abbrevation, pageNo, pageSize);
	}

/////  pagination model mapper not working here we have check again come here and we can resolve
	@GetMapping("/listPagination")
	public ItemListDTO listPagination(@RequestParam(required = false, defaultValue = "0") int PageNo,
			@RequestParam(required = false, defaultValue = "10") int pageSize, @RequestParam String abbrevation) {

		List<Item> item = itemService.findItemByCity(abbrevation);

		ItemListData listData = new ItemListData();
		listData.setItemsdata(item);

		ItemListDTO dto = modelMapper.map(listData, ItemListDTO.class);

		return dto;

	}

	@GetMapping("/item/list")
	public List<Item> findByAgent(@RequestParam String email) {
		Customer customer = customerService.findByEmail(email);
		 List<Item>  agentfind=itemService.findByAgent(customer);
		return agentfind;
	}
	
	@GetMapping("/itemlist/dto")
	 public ItemListDTO findByAgent1(@RequestParam String email) {
		Customer customer=customerService.findByEmail(email);
		List<Item>  agentfind=itemService.findByAgent(customer);
		ItemListData listData = new ItemListData();
		listData.setItemsdata(agentfind);
	  ItemListDTO	dto=modelMapper.map(listData, ItemListDTO.class);
	  return dto;
	 }

}

//@GetMapping("/listpage")
//	public Page<ProductContent> getCustomers(@RequestParam (required=false, defaultValue="0") int pageNo, @RequestParam (required=false, defaultValue="10") int pageSize) {
//		return productContentService.getCustomers(pageNo, pageSize);