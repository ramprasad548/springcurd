/********************************************************************
* ACG
* All Rights Reserved 
*
* File: CustomerProductsVO.java
********************************************************************
*
*  Ver   Date              Author             Description
*  ====  ========          ============       ==================
*  1.0   Sep 4, 2015       KulaSekhar         Created
/ ********************************************************************/
package com.beingjavaguys.vo.base;

import java.util.ArrayList;
import java.util.List;

import com.beingjavaguys.common.utils.ObjectValidator;
import com.beingjavaguys.vo.api.APIStatusVO;

public class CustomerProductStatusVO {
	
	private String customerUI;
	private List<AutoProductVO> apps;
	private List<OfferProductVO> offers;
	

	
	
	/**
	 * @return the apps
	 */
	public List<AutoProductVO> getApps() {
		return apps;
	}




	/**
	 * @param apps the apps to set
	 */
	public void setApps(List<AutoProductVO> apps) {
		this.apps = apps;
	}




	public void addAutoProduct(AutoProductVO autoProduct)
	{
	    if 	(ObjectValidator.isAllEmpty(this.apps))
	    {
	    	this.apps = new ArrayList<AutoProductVO>();
	    }
	    this.apps.add(autoProduct);
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

	/**
	 * @return the offers
	 */
	public List<OfferProductVO> getOffers() {
		return offers;
	}

	/**
	 * @param offers the offers to set
	 */
	public void setOffers(List<OfferProductVO> offers) {
		this.offers = offers;
	}
	public void addOfferProduct(OfferProductVO offer)
	{
		 if (ObjectValidator.isAllEmpty(this.offers))
		 {
		  	this.offers = new ArrayList<OfferProductVO>();
		 }
		 this.offers.add(offer);
	}
}
