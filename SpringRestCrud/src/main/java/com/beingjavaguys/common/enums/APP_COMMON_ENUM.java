/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: VENDORS_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    Apr 29, 2015   Siva Nagaraju                   Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author Cherivi
 *
 */
public enum APP_COMMON_ENUM {

	SUCCESSFUL("SUCCESSFUL"),
	UNSUCCESSFUL("UNSUCCESSFUL"),
	Success("Success"),
	FAILURE("FAILURE");
	
	private String desc;
	
	APP_COMMON_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
	
}
