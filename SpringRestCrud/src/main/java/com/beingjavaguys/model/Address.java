package com.beingjavaguys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.tblAddress") 
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String contactName;
	private String streetAddress;
	private String city;
	private String state;
	private String companyName;
	private String zip;
	private String phoneNumber;
	private String faxNumber;
	private String emailAddress;
	private int spillSystemId;
	private int spillNumber;
 
    @Column(name="varContactName")
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	@Column(name="varStreetAddress")
	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	@Column(name="varCity")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name="varState")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name="varCompanyName")
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name="varZip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}
	@Column(name="varPhoneNumber")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Column(name="varFaxNumber")
	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	@Column(name="varEmailAddress")
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Column(name="intSpillSystemID")
	public int getSpillSystemId() {
		return spillSystemId;
	}

	public void setSpillSystemId(int spillSystemId) {
		this.spillSystemId = spillSystemId;
	}
	@Column(name="intSpillNumber")
	public int getSpillNumber() {
		return spillNumber;
	}

	public void setSpillNumber(int spillNumber) {
		this.spillNumber = spillNumber;
	}

	@Id
	@GeneratedValue
	@Column(name = "intAddressSystemID")
	private long id;
		  
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
 
	public Address() {
		 
	}

}
