package com.real.icrement.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.model.ContactModel;
import com.real.icrement.service.ContactService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

	@Resource(name="contactService")
	private ContactService contactService;
	
	@PostMapping("/create")
	private ContactModel contactModel(@RequestBody ContactModel contactModel) {
		return contactService.save(contactModel);
	}
	
}
