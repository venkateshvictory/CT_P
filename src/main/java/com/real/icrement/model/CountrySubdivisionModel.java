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
@Table(name = "JT_COUNTRY_SUB")
public class CountrySubdivisionModel {


    @Id
    @Column(name = "ABBREVIATION")
    protected String abbreviation;
    
    
	@ManyToOne(cascade = { CascadeType.PERSIST,
			CascadeType.MERGE }, targetEntity = CountrySubdivision.class, optional = false)
	@JoinColumn(name = "REGION")
	private CountrySubdivision countrySubdivision;

	@Column(name = "DESCRIPTION")
	private String description;

	public CountrySubdivision getCountrySubdivision() {
		return countrySubdivision;
	}

	public void setCountrySubdivision(CountrySubdivision countrySubdivision) {
		this.countrySubdivision = countrySubdivision;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	

}
