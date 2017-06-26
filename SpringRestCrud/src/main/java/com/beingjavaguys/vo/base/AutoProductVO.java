/********************************************************************
* ACG
* All Rights Reserved 
*
* File: AutoProductVO.java
********************************************************************
*
*  Ver   Date              Author             Description
*  ====  ========          ============       ==================
*  0.1  Sep 18, 2015       Sreeram            Created
/ ********************************************************************/
package com.beingjavaguys.vo.base;

public class AutoProductVO  {

	private Long appId;
	private String offerCode;
	private String status;
    private double loanAmount;
	private double apr;
	private int term;
	private String product ;
	private String createdDate;
	private String lastActivityDate;	
	private String expireDate;
	private String shortDescription;
	private String longDescription;
	private String offerType;
	private String applicationType ="P";
	/**
	 * @return the appId
	 */
	public Long getAppId() {
		return appId;
	}
	/**
	 * @param appId the appId to set
	 */
	public void setAppId(Long appId) {
		this.appId = appId;
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
	 * @return the loanAmount
	 */
	public double getLoanAmount() {
		return loanAmount;
	}
	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	/**
	 * @return the apr
	 */
	public double getApr() {
		return apr;
	}
	/**
	 * @param apr the apr to set
	 */
	public void setApr(double apr) {
		this.apr = apr;
	}
	/**
	 * @return the term
	 */
	public int getTerm() {
		return term;
	}
	/**
	 * @param term the term to set
	 */
	public void setTerm(int term) {
		this.term = term;
	}
	/**
	 * @return the product
	 */
	public String getProduct() {
		return product;
	}
	/**
	 * @param product the product to set
	 */
	public void setProduct(String product) {
		this.product = product;
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
	 * @return the lastActivityDate
	 */
	public String getLastActivityDate() {
		return lastActivityDate;
	}
	/**
	 * @param lastActivityDate the lastActivityDate to set
	 */
	public void setLastActivityDate(String lastActivityDate) {
		this.lastActivityDate = lastActivityDate;
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
	/**
	 * @return the applicationType
	 */
	public String getApplicationType() {
		return applicationType;
	}
	/**
	 * @param applicationType the applicationType to set
	 */
	public void setApplicationType(String applicationType) {
		this.applicationType = applicationType;
	}
	
	
}
