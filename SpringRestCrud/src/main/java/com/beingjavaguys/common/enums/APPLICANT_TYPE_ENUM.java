/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: APPLICANT_TYPE_ENUM.java  
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
public enum APPLICANT_TYPE_ENUM {
	
	PRIMARY("Primary"),
	SECONDARY("Secondary");
	
	
private String desc;
	
	APPLICANT_TYPE_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

}
