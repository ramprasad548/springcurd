/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: PHONE_TYPE_ENUM.java  
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
public enum PHONE_TYPE_ENUM {
	
	HOME("Home"),
	WORK("Work"),
	CELL("Cell");
	
	
	private String desc;
	
	PHONE_TYPE_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

}
