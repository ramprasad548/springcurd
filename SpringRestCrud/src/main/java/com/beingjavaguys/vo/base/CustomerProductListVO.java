/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: CustomerProductsListVO.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Sep 4, 2015   KulaSekhar                   Initial version
*
*********************************************** ***************************/
package com.beingjavaguys.vo.base;

import java.util.List;

import com.beingjavaguys.vo.api.APIStatusVO;

/**
 * @author p78114
 *
 */
public class CustomerProductListVO  {
	
	private APIStatusVO apiStatus;
	private List<CustomerProductStatusVO> customerProducts ;
	

	public CustomerProductListVO() {
		super();
		apiStatus = new APIStatusVO();
	}
	/**
	 * @return the apiStatus
	 */
	public APIStatusVO getApiStatus() {
		return apiStatus;
	}
	/**
	 * @param apiStatus the apiStatus to set
	 */
	public void setApiStatus(APIStatusVO apiStatus) {
		this.apiStatus = apiStatus;
	}
	/**
	 * @return the customerProducts
	 */
	public List<CustomerProductStatusVO> getCustomerProducts() {
		return customerProducts;
	}
	/**
	 * @param customerProducts the customerProducts to set
	 */
	public void setCustomerProducts(List<CustomerProductStatusVO> customerProducts) {
		this.customerProducts = customerProducts;
	}
	
	
}
