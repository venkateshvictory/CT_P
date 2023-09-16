package com.real.icrement.dto;

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.real.icrement.model.CountrySubdivisionModel;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ItemDTO {
	@XmlElement
	private Long id;
	@XmlElement
	private String code;
	@XmlElement
	private String name;
	@XmlElement
	private String desciption;
	@XmlElement
	private String line1;
	@XmlElement
	private String line2;
	@XmlElement
	private String line3;
	@XmlElement

	private String establishedOn;
	@XmlElement
	private CountrySubdivisionModel countrySubdivision;

	private Long countrySubdivisionId;

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

	public Long getCountrySubdivisionId() {
		return countrySubdivisionId;
	}

	public void setCountrySubdivisionId(Long countrySubdivisionId) {
		this.countrySubdivisionId = countrySubdivisionId;
	}

}
