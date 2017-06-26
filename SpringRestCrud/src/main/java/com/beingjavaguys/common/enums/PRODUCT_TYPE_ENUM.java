/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: PRODUCT_TYPE_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    Apr 29, 2015   Siva Nagaraju             Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author p78032
 *
 */
public enum PRODUCT_TYPE_ENUM {

	VEHICLE("Vehicle");
	
	
	private String desc;
	
	PRODUCT_TYPE_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
}
