package com.real.icrement.model;

import org.hibernate.annotations.Cache;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Entity
@Table(name = "BLC_COUNTRY_SUB")

public class CountrySubdivision {

	@Id
	@Column(name = "ABBREVIATION")
	protected String abbreviation;

	@Column(name = "NAME", nullable = false)
	protected String name;

	@Column(name = "ALT_ABBREVIATION")
	protected String alternateAbbreviation;

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAlternateAbbreviation() {
		return alternateAbbreviation;
	}

	public void setAlternateAbbreviation(String alternateAbbreviation) {
		this.alternateAbbreviation = alternateAbbreviation;
	}

}
