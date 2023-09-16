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
@Table(name = "ITEM")
public class Item {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "CODE")
	private String code;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String desciption;

	@Column(name = "LINE1")
	private String line1;

	@Column(name = "LINE2")
	private String line2;

	@Column(name = "LINE3")
	private String line3;

	@Column(name = "ESTABLISHED_ON")
	private String establishedOn;

	@ManyToOne(cascade = { CascadeType.PERSIST,
			CascadeType.MERGE }, targetEntity = CountrySubdivisionModel.class, optional = true)
	@JoinColumn(name = "REGION")
	private CountrySubdivisionModel countrySubdivision;

	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE }, targetEntity = Customer.class, optional = true)
	@JoinColumn(name = "CREATED_BY")
	private Customer createdBy;

//	@ManyToOne(cascade = { CascadeType.PERSIST,
//			CascadeType.MERGE }, targetEntity = JTCountrySubdivisionModel.class, optional = true)
//	@JoinColumn(name = "JTCOUNTRY_SUBDIVISION")
//	private JTCountrySubdivision jtCountrySubdivision;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesciption() {
		return desciption;
	}

	public void setDesciption(String desciption) {
		this.desciption = desciption;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getLine3() {
		return line3;
	}

	public void setLine3(String line3) {
		this.line3 = line3;
	}

	public String getEstablishedOn() {
		return establishedOn;
	}

	public void setEstablishedOn(String establishedOn) {
		this.establishedOn = establishedOn;
	}

	public CountrySubdivisionModel getCountrySubdivision() {
		return countrySubdivision;
	}

	public void setCountrySubdivision(CountrySubdivisionModel countrySubdivision) {
		this.countrySubdivision = countrySubdivision;
	}

	public Customer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Customer createdBy) {
		this.createdBy = createdBy;
	}

}
