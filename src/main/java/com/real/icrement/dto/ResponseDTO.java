package com.real.icrement.dto;

public class ResponseDTO {

	String statusCode;
	String message;
	String verificationPending;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getVerificationPending() {
		return verificationPending;
	}

	public void setVerificationPending(String verificationPending) {
		this.verificationPending = verificationPending;
	}

}
