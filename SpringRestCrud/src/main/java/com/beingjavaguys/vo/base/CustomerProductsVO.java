/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: CustomerProductsVO.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Sep 4, 2015   KulaSekhar                   Initial version
*
*********************************************** ***************************/
package com.beingjavaguys.vo.base;

import java.util.List;


public class CustomerProductsVO {
	
	private String customerUI;
	private List<CustomerOfferVO> offers ;
	private List<CustomerAppVO> apps;
	
	/**
	 * @return the offers
	 */
	public List<CustomerOfferVO> getOffers() {
		return offers;
	}
	/**
	 * @param offers the offers to set
	 */
	public void setOffers(List<CustomerOfferVO> offers) {
		this.offers = offers;
	}
	/**
	 * @return the apps
	 */
	public List<CustomerAppVO> getApps() {
		return apps;
	}
	/**
	 * @param apps the apps to set
	 */
	public void setApps(List<CustomerAppVO> apps) {
		this.apps = apps;
	}
	/**
	 * @return the customerUI
	 */
	public String getCustomerUI() {
		return customerUI;
	}
	/**
	 * @param customerUI the customerUI to set
	 */
	public void setCustomerUI(String customerUI) {
		this.customerUI = customerUI;
	}
}
