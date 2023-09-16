package com.real.icrement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CUSTOMER_ROLE")
public class CustomerRole {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "ROLE_NAME")
	private String roleName;

	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.MERGE }, targetEntity = Customer.class, optional = true)
	@JoinColumn(name = "CUSTOMER")
	private Customer customer;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	

}
