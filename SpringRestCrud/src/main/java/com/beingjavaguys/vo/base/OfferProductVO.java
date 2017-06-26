/********************************************************************
* ACG
* All Rights Reserved 
*
* File: OfferProductVO.java
********************************************************************
*
*  Ver   Date              Author             Description
*  ====  ========          ============       ==================
*  0.1  Sep 18, 2015       Sreeram            Created
/ ********************************************************************/
package com.beingjavaguys.vo.base;

public class OfferProductVO  {

	private String offerCode;
    private String offerType ;
	private String status;
	private Double availableCredit;
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
	private Double apr;
	private Integer term;
	private String createdDate;
	private String expireDate;
	private String collateralType;
	//private String rateType;
	private Boolean ach = Boolean.FALSE;
	private String shortDescription;
	private String longDescription;
	
	
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
	/**
	 * @return the ach
	 */
	public Boolean getAch() {
		return ach;
	}
	/**
	 * @param ach the ach to set
	 */
	public void setAch(Boolean ach) {
		this.ach = ach;
	}
	/**
	 * @return the expireDate
	 */
	public String getExpireDate() {
		return expireDate;
	}
	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	/**
	 * @return the offerType
	 */
	public String getOfferType() {
		return offerType;
	}
	/**
	 * @param offerType the offerType to set
	 */
	public void setOfferType(String offerType) {
		this.offerType = offerType;
	}
	
}
