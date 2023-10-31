package com.real.icrement.cart;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.model.BusinesModel;
import com.real.icrement.service.BusinesService;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("/api/busines")
public class BusinesController {

	@Resource(name="businesService")
	private BusinesService businesService;
	
	@PostMapping("/create")
	public BusinesModel save(@RequestBody BusinesModel businesModel) {
		return businesService.save(businesModel);
	}
	
}
