package com.real.icrement.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.model.AddresModel;
import com.real.icrement.service.AddresService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/address")
public class AddresController {

	@Resource(name="addresService")
	private AddresService addresService;
	
	@PostMapping("/create")
	public AddresModel addresModel(@RequestBody AddresModel addresModel) {
		return addresService.save(addresModel);
	}
}
