package com.real.icrement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="CONTACT_MODEL")
@Data
@NoArgsConstructor
public class ContactModel {

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Long contact_id;
	@Column(name="CONTACT_NAME")
	private String contactName;
	@Column(name="EMAIL")
	private String email;
	@Column(name="PHONE_CODE")
	private Long phoneCode;
	@Column(name="PHONE_NUMBER")
	private Long phoneNumber;
	@Column(name="ADDRESS_ID")
	private Long addressId;
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = AddresModel.class)
	@JoinColumn(name = "ADDRES_MODEL")
	private AddresModel address;


}