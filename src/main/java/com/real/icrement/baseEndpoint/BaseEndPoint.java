package com.real.icrement.baseEndpoint;

import com.real.icrement.service.Constants;

public abstract class BaseEndPoint {

	protected ResponseDTO updateUnAuthorizedMessage(ResponseDTO response, String message) {
		
		response.setMessage(message);
		response.setStatusCode(Constants.UNAUTHORIZED);
		return response;
	}
	
	public ResponseDTO successfulAuthorizedMesssage(ResponseDTO response,String message) {
		
		response.setMessage(message);
		response.setStatusCode(Constants.SUSSFUL_AUTHORIZED);
		return response;
	}
}
