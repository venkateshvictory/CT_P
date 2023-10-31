 	 	package com.real.icrement.serviceimpl;

import com.google.gson.Gson;
import com.real.icrement.dto.AddRequest;
import com.real.icrement.dto.AddResponse;
import com.real.icrement.utils.HmacSha256Utils;

public class HmacTestService {

	private String secreteKey = "This Is My SecreteKey";

	public int validateAndProcess(AddRequest req ,String signature2) {
		
		Gson gson = new Gson();
		String jsonRequest=gson.toJson(req);
		String signature=HmacSha256Utils.geneteSignature(secreteKey, jsonRequest);
		
		if(signature.equals(signature2)) {
			return req.getNum1() + req.getNum2();
	}
		
		return -1;
	}
	
}
