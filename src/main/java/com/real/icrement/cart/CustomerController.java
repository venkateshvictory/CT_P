package com.real.icrement.cart;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.real.icrement.aws.jws.JTAwsBlobService;
import com.real.icrement.baseEndpoint.ResponseDTO;
import com.real.icrement.dto.CustomerDTO;
import com.real.icrement.dto.MediaDTO;
import com.real.icrement.model.Customer;
import com.real.icrement.model.CustomerRole;
import com.real.icrement.model.MediaModel;
import com.real.icrement.repository.CustomerRepository;
import com.real.icrement.service.CustomerRoleService;
import com.real.icrement.service.CustomerService;
import com.real.icrement.serviceimpl.CustomerServiceImpl;

import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Resource(name = "customerService")
	private CustomerService customerService;

	@Autowired
	private ModelMapper modelMapper;
	
	@Resource(name="jtAwsBlobService")
	private JTAwsBlobService jtAwsBlobService;

	@PostMapping("/create")
	public CustomerDTO save(@RequestBody CustomerDTO customer) {
		/*
		 * Customer customerModel = new Customer();
		 * customerModel.setFirstName(customer.getFirstName());
		 * customerModel.setLastName(customer.getLastName());
		 * customerModel.setEmailAddress(customer.getEmailAddress());
		 * customer.setPassword(customer.getPassword()); customer.setRegistered(true);
		 * customer.setRequestedTime(new Date());
		 */
		
		Customer model = modelMapper.map(customer, Customer.class);
         model.setRequestedTime(new Date());
         model.setRegistered(true);
		Customer savedData = customerService.save(model);
		CustomerDTO customerDto = modelMapper.map(savedData, CustomerDTO.class);
        return customerDto;
	}
	
	
	@GetMapping("/getCustomerData")
	public CustomerDTO getCurrentCustomer(HttpServletRequest request) {
		Customer customer = customerService.currentCustomer();
	CustomerDTO	customerDto=modelMapper.map(customer, CustomerDTO.class);
		return null;
		
	}
	
	@PostMapping("/picture")
    public MediaDTO uploadProfilePicture(@RequestParam Long customerId, @ModelAttribute MultipartFile profilePicture) throws FileNotFoundException, IOException {
	
		 
         MediaModel media=jtAwsBlobService.uploadFile(profilePicture);
//        Customer customer=customerServiceImpl.findById(customerId);
//        Customer customer=CustomerState.getCustomer();
//         customer.setPassword(null);
//         customer.setProfilePicture(media);
    //    customerServiceImpl.save(customer);
      Customer customer=customerService.findById(customerId);
      customer.setProfilePicture(media);
        customerService.save(customer);
		return modelMapper.map(media, MediaDTO.class);
         
		//return modelMapper.map(customer, MediaDTO.class);
	
}	
	@GetMapping("/find/{id}")
	public Customer findById(@PathVariable("id") Long id) {
   
		return customerService.findById(id);
	}
	
	@GetMapping("/findbyname/{firstName}")
	public List<Customer> findByName(@PathVariable("firstName") String firstName) {
		return customerService.findByName(firstName);
	}
	
	@GetMapping("/findbycustomer/{email}")
	public List<Customer> findByCustomer(@PathVariable("email") String email){
		return customerService.findByCustomer(email);
		
	}
	
	
	
}
