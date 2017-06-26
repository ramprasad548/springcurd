/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: LOAN_PURPOSE_ENUM.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ -------------------------------------------------------------
* 1.0    Apr 29, 2015    Siva Nagaraju                   Initial version
*********************************************** **************************

/**
 * 
 */
package com.beingjavaguys.common.enums;

/**
 * @author p78032
 *
 */
public enum LOAN_PURPOSE_ENUM {
	
	VEHICLE_PURCHASE("Vehicle Purchase"),
	DEBT_CONSOLIDATION("Debt Consolidation"),
	HOME_IMPROVEMENT("Home Improvement"),
	REFINANCE("Refinance"),
	OTHER("Other");
	
	
	private String desc;
	
	LOAN_PURPOSE_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

}
