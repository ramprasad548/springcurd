/**
*
* File: CustomerAppVO.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Sep 4, 2015   KulaSekhar                   Initial version
*
*********************************************** ***************************/
package com.beingjavaguys.vo.base;


public class CustomerAppVO {

	private Long appId;
	private String offerCode;
    private double loanAmount;
	private double apr;
	private int term;
	private String product ;
	private String status;
	private String appCreatedDate;
	private String lastActivityDate;	
	private String appExpiryDate;
	private String shortDescription;
	private String longDescription;
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
	 * @return the appCreatedDate
	 */
	public String getAppCreatedDate() {
		return appCreatedDate;
	}
	/**
	 * @param appCreatedDate the appCreatedDate to set
	 */
	public void setAppCreatedDate(String appCreatedDate) {
		this.appCreatedDate = appCreatedDate;
	}
	/**
	 * @return the appExpiryDate
	 */
	public String getAppExpiryDate() {
		return appExpiryDate;
	}
	/**
	 * @param appExpiryDate the appExpiryDate to set
	 */
	public void setAppExpiryDate(String appExpiryDate) {
		this.appExpiryDate = appExpiryDate;
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
