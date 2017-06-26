/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: CustomerOfferVO.java  
*************************************************************************
* Ver     Date          	Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Sep 02, 2015      KulaSekhar                     Initial version
*********************************************** **************************/
package com.beingjavaguys.vo.base;


public class CustomerOfferVO  {
	
	private String offerCode;  
	private String status;  
	private Double availableCredit;
	private Double apr;
	private Integer term;
	private String createdDate;
	private String expirationDate;
	private String collateralType;
	private String rateType;
	private String shortDescription;
	private String longDescription;
	/*private boolean rateType;*/
	 
	public CustomerOfferVO() {
		
	}  
	
	/**
	 * @return the offerCode
	 */
	public String getOfferCode() {
		return offerCode;
	}
	/**
	 * @param offerCode the offerCode to set
	 */
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	/**
	 * @return the availableCredit
	 */
	public Double getAvailableCredit() {
		return availableCredit;
	}
	/**
	 * @param availableCredit the availableCredit to set
	 */
	public void setAvailableCredit(Double availableCredit) {
		this.availableCredit = availableCredit;
	}
	/**
	 * @return the apr
	 */
	public Double getApr() {
		return apr;
	}
	/**
	 * @param apr the apr to set
	 */
	public void setApr(Double apr) {
		this.apr = apr;
	}
	/**
	 * @return the term
	 */
	public Integer getTerm() {
		return term;
	}
	/**
	 * @param term the term to set
	 */
	public void setTerm(Integer term) {
		this.term = term;
	}
	/**
	 * @return the createdDate
	 */
	public String getCreatedDate() {
		return createdDate;
	}
	/**
	 * @param createdDate the createdDate to set
	 */
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	/**
	 * @return the collateralType
	 */
	public String getCollateralType() {
		return collateralType;
	}

	/**
	 * @param collateralType the collateralType to set
	 */
	public void setCollateralType(String collateralType) {
		this.collateralType = collateralType;
	}

	/**
	 * @return the rateType
	 *//*
	public boolean isRateType() {
		return rateType;
	}

	*//**
	 * @param rateType the rateType to set
	 *//*
	public void setRateType(boolean rateType) {
		this.rateType = rateType;
	}*/

	/**
	 * @return the rateType
	 */
	public String getRateType() {
		return rateType;
	}

	/**
	 * @param rateType the rateType to set
	 */
	public void setRateType(String rateType) {
		this.rateType = rateType;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the shortDescription
	 */
	public String getShortDescription() {
		return shortDescription;
	}

	/**
	 * @param shortDescription the shortDescription to set
	 */
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
}
