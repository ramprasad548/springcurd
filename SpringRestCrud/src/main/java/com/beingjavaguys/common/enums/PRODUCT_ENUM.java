/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: PRODUCT_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    Apr 29, 2015       p78032                   Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author p78032
 *
 */
public enum PRODUCT_ENUM {
	
	AUTO_LOAN("Auto"),
	HOME_LOAN("HELOC");
	
	
	private String desc;
	
	PRODUCT_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

}
