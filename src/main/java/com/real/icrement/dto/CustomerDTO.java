package com.real.icrement.dto;

import java.util.Date;

import com.real.icrement.model.MediaModel;

public class CustomerDTO {

	private Long id;
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private boolean registered;
	private Date requestedTime;
	private MediaModel profilePicture;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public Date getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(Date requestedTime) {
		this.requestedTime = requestedTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MediaModel getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(MediaModel profilePicture) {
		this.profilePicture = profilePicture;
	}
	
}
