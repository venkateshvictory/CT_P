package com.real.icrement.baseEndpoint;

public class ResponseDTO {

	private String message;
	private String statusCode;
	private boolean verificationPending;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public boolean isVerificationPending() {
		return verificationPending;
	}

	public void setVerificationPending(boolean verificationPending) {
		this.verificationPending = verificationPending;
	}

}
