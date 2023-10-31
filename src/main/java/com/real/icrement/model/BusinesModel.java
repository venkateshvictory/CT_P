package com.real.icrement.model;



import com.real.icrement.enu.Currency;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "BUSINESS")
@Data
public class BusinesModel {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long businessId;
	@Column(name = "LEGAL_NAME")
	private String legalName;
	@Column(name = "DISPLAY_NAME")
	private String displayName;
	@Column(name = "WEBSITE_LINK")
	private String websiteLink;
	
	@Enumerated(EnumType.ORDINAL)
	private Currency currency;    //enum
	
	@Column(name = "BUSINES_TYPE")
	private String businesType;
	@Column(name = "CONTACT_ID")
	private Long contactId;
	@Column(name = "BUSINESS_GST")
	private String businessGst;
	@Column(name = "BUSINESS_PAN")
	private String businessPan;
	@Column(name = "BUSINES_LOGO")
	private String businessLogo;
	@Column(name = "ORDER_SYSTEM")
	private boolean orderSystem;
	
	@ManyToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, targetEntity = ContactModel.class)
	@JoinColumn(name = "CONTACT_MODEL")
	private ContactModel contact;

}
