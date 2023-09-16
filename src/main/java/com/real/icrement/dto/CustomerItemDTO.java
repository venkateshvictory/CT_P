package com.real.icrement.dto;

import com.real.icrement.model.Customer;
import com.real.icrement.model.Item;

import jakarta.persistence.Column;

public class CustomerItemDTO {

	private Long id;

	private Customer jtCustomer;

	private Item jtItem;

	@Column(name = "NOTIFY_WHEN_OTHERS_ADDED")
	private Boolean notifyWhenOthersAdded;

	@Column(name = "NOTIFY_WHEN_TOU_JOINED")
	private Boolean notifyWhenYouJoined;

	@Column(name = "ITEM_ROLE")
	private String role;

	@Column(name = "DESIGNATION")
	private String designation;

	private Customer createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getJtCustomer() {
		return jtCustomer;
	}

	public void setJtCustomer(Customer jtCustomer) {
		this.jtCustomer = jtCustomer;
	}

	public Item getJtItem() {
		return jtItem;
	}

	public void setJtItem(Item jtItem) {
		this.jtItem = jtItem;
	}

	public Boolean getNotifyWhenOthersAdded() {
		return notifyWhenOthersAdded;
	}

	public void setNotifyWhenOthersAdded(Boolean notifyWhenOthersAdded) {
		this.notifyWhenOthersAdded = notifyWhenOthersAdded;
	}

	public Boolean getNotifyWhenYouJoined() {
		return notifyWhenYouJoined;
	}

	public void setNotifyWhenYouJoined(Boolean notifyWhenYouJoined) {
		this.notifyWhenYouJoined = notifyWhenYouJoined;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Customer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Customer createdBy) {
		this.createdBy = createdBy;
	}

}
