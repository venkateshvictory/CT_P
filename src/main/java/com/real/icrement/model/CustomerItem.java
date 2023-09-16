package com.real.icrement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="CUSTOMER_ITEM")
public class CustomerItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = Customer.class, optional = false)
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = Item.class, optional = true)
	@JoinColumn(name = "ITEM")
	private Item item;
	
	@Column(name = "NOTIFY_WHEN_OTHERS_ADDED")
	private Boolean notifyWhenOthersAdded;

	@Column(name = "NOTIFY_WHEN_TOU_JOINED")
	private Boolean notifyWhenYouJoined;

	@Column(name = "ITEM_ROLE")
	private String role;
	
	@Column(name = "DESIGNATION")
	private String designation;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = Customer.class, optional = false)
	@JoinColumn(name = "CREATED_BY")
	private Customer createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}
	
	
	
}
