/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: INCOME_FREQUENCY_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    May 8, 2015      p78032                   Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author p78032
 *
 */
public enum INCOME_FREQUENCY_ENUM {
	
	MONTHLY("Monthly"),
	ANNUAL("Annual");
	
	
	private String desc;
	
	INCOME_FREQUENCY_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

}
