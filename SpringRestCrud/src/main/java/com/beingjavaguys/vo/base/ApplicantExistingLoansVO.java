/*************************************************************************
* Copyright (C) 2017
* ACG
* All Rights Reserved 
*
* File: CustomerExistingLoansVO.java  
*************************************************************************
* Ver     Date          	Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Apr 04, 2017      RamPrasad                     Initial version
*********************************************** **************************/
package com.beingjavaguys.vo.base;



public class ApplicantExistingLoansVO  {
	
	private String loanAccountNumber;
	private String instituteName;
	private Double balanceAmount;
	private String balanceAsOfDate;
	private String accountOpenedDate;
	private String isAccountSelected;
	private String cirfAppId;
	private String cirfAppDetailId;
	
	public ApplicantExistingLoansVO() {
		
	}

	/**
	 * @return the loanAccountNumber
	 */
	public String getLoanAccountNumber() {
		return loanAccountNumber;
	}

	/**
	 * @param loanAccountNumber the loanAccountNumber to set
	 */
	public void setLoanAccountNumber(String loanAccountNumber) {
		this.loanAccountNumber = loanAccountNumber;
	}

	/**
	 * @return the instituteName
	 */
	public String getInstituteName() {
		return instituteName;
	}

	/**
	 * @param instituteName the instituteName to set
	 */
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	/**
	 * @return the balanceAmount
	 */
	public Double getBalanceAmount() {
		return balanceAmount;
	}

	/**
	 * @param balanceAmount the balanceAmount to set
	 */
	public void setBalanceAmount(Double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	/**
	 * @return the balanceAsOfDate
	 */
	public String getBalanceAsOfDate() {
		return balanceAsOfDate;
	}

	/**
	 * @param balanceAsOfDate the balanceAsOfDate to set
	 */
	public void setBalanceAsOfDate(String balanceAsOfDate) {
		this.balanceAsOfDate = balanceAsOfDate;
	}

	/**
	 * @return the accountOpenedDate
	 */
	public String getAccountOpenedDate() {
		return accountOpenedDate;
	}

	/**
	 * @param accountOpenedDate the accountOpenedDate to set
	 */
	public void setAccountOpenedDate(String accountOpenedDate) {
		this.accountOpenedDate = accountOpenedDate;
	}

	/**
	 * @return the isAccountSelected
	 */
	public String getIsAccountSelected() {
		return isAccountSelected;
	}

	/**
	 * @param isAccountSelected the isAccountSelected to set
	 */
	public void setIsAccountSelected(String isAccountSelected) {
		this.isAccountSelected = isAccountSelected;
	}

	/**
	 * @return the cirfAppId
	 */
	public String getCirfAppId() {
		return cirfAppId;
	}

	/**
	 * @param cirfAppId the cirfAppId to set
	 */
	public void setCirfAppId(String cirfAppId) {
		this.cirfAppId = cirfAppId;
	}

	/**
	 * @return the cirfAppDetailId
	 */
	public String getCirfAppDetailId() {
		return cirfAppDetailId;
	}

	/**
	 * @param cirfAppDetailId the cirfAppDetailId to set
	 */
	public void setCirfAppDetailId(String cirfAppDetailId) {
		this.cirfAppDetailId = cirfAppDetailId;
	}
 
	
	
	}
