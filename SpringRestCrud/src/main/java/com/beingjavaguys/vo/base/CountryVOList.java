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

import java.util.List;

public class CountryVOList extends BankBaseVO{

	public CountryVOList() {
	}

	
	private List<CountryVO> countryVOList ;

	public List<CountryVO> getCountryVOList() {
		return countryVOList;
	}

	public void setCountryVOList(List<CountryVO> countryVOList) {
		this.countryVOList = countryVOList;
	}
	
	
}
