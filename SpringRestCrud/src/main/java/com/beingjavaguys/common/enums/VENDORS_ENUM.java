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
 * @author p78032
 *
 */
public enum VENDORS_ENUM {

	NADA("NADA"),
	CHROMEDATA("Chrome Data"),
	TRANSUNION("TU"),
	CRIF("CRIF"),
	FISERV("FiServ");
	
	private String desc;
	
	VENDORS_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
	
}
