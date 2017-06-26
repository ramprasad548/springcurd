/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: HOUSING_STATUS_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    May 8, 2015       p78032                   Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author p78032
 *
 */
public enum HOUSING_STATUS_ENUM {

	OWN("Own"),
	RENT("Rent"),
	OTHER("Other");
	
	
	private String desc;
	
	HOUSING_STATUS_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
}
