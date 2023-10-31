package com.real.icrement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ADDRESS_MODEL")
@Data
@NoArgsConstructor
public class AddresModel {

	@Id
	@GeneratedValue
	@Column(name = "ADDRESS_ID")
	private Long addressId;

	@Column(name = "FULL_ADDRESS")
	private String fullAddress;
	@Column(name = "DISTRICT")
	private String district;
	@Column(name = "CITY")
	private String city;
	@Column(name = "ADDRESS_STATE")
	private String AddresState;
	@Column(name = "POSTAL_CODE")
	private Long postalCode;
	@Column(name = "COUNTRY")
	private String country;

	@Column(name = "DIRECTIONS")
	private String directions;

}
