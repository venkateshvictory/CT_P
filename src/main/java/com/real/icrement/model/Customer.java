package com.real.icrement.model;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String LastName;

	@Column(name = "EMAIL_ADDRESS")
	private String emailAddress;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "IS_REGISTERED")
	private boolean registered;

	@Column(name = "DATE")
	private Date requestedTime;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.MERGE }, targetEntity = MediaModel.class, optional = true)
	@JoinColumn(name = "PROFILE_PICTURE")
	private MediaModel profilePicture;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRequestedTime() {
		return requestedTime;
	}

	public void setRequestedTime(Date requestedTime) {
		this.requestedTime = requestedTime;
	}

	public MediaModel getProfilePicture() {
		return profilePicture;
	}

	public void setProfilePicture(MediaModel profilePicture) {
		this.profilePicture = profilePicture;
	}

}
