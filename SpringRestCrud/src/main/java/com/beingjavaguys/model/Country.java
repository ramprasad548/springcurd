package com.beingjavaguys.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dbo.ltblCounty") 
public class Country implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int countryId;
	private String countryName;
	
	@Id
	@GeneratedValue
	@Column(name = "intID")
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	@Column(name = "chrCountyName")
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	 
}
