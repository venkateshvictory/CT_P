package com.real.icrement.cart;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.real.icrement.dto.AddRequest;
import com.real.icrement.dto.AddResponse;
import com.real.icrement.serviceimpl.HmacTestService;

@RestController
@RequestMapping("/hmac")
public class HamacProcessingController {

	//0DywStPJh9h4ISjIo7u9v5Ew7RvgDKPgV8DApJLWwTQ=
	@PostMapping("/validateAndProcess")
	public AddResponse ValidateAndProcessRequest(@RequestHeader("signature") String signature, @RequestBody AddRequest addRequest) {
		 
		HmacTestService service = new HmacTestService();
		int res = service.validateAndProcess(addRequest ,signature );
		AddResponse response = new AddResponse();
		response.setResValue(res);
		
    return		response;
		
	}
}
