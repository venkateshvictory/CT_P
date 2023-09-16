package com.real.icrement.cart;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.baseEndpoint.BaseEndPoint;
import com.real.icrement.baseEndpoint.ResponseDTO;
import com.real.icrement.model.CustomerRole;
import com.real.icrement.service.CustomerRoleService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/customerRole")
public class CustomerRoleController extends BaseEndPoint{

	@Resource(name = "customerRoleService")
	private CustomerRoleService customerRoleService;
	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/create")
	public CustomerRole save(@RequestBody CustomerRole customerRole) {
		return customerRoleService.save(customerRole);
	}

	@GetMapping("/getbyemail/{email}")
	public List<CustomerRole> findByCustomer(@PathVariable("email") String email) {
		List<CustomerRole> customer = customerRoleService.findByCustomer(email);
		return customer;
	}
	
	@GetMapping("/findHasAdminRole/{email}")
	public boolean findHasAdminRoleAvailable(@PathVariable("email") String email){
		
		return customerRoleService.hasAdminRole(email);
		
	}
	
	@GetMapping("/unAuthorized/{email}")
	public ResponseDTO unAuthorizedMessage(@PathVariable("email") String email) {
	      ResponseDTO response = new ResponseDTO();
		if(!customerRoleService.hasAdminRole(email)) {
			return updateUnAuthorizedMessage(response,"you are not allowed give  a role");
		}
		return successfulAuthorizedMesssage(response,"you are allowed to give a role");
		

     }
	@GetMapping("/agentRole/{email}")
	public ResponseDTO findAgentRole(@PathVariable("email") String email) {
		ResponseDTO response = new ResponseDTO();
		if(!customerRoleService.hasAgentRole(email)) {
			return updateUnAuthorizedMessage(response, "you are not allowed to give a role");
		}
		return successfulAuthorizedMesssage(response, "you are allowed to update a role");
		
	}
	
}
