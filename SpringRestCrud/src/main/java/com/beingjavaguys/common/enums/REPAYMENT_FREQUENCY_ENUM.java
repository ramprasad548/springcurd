/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: REPAYMENT_FREQUENCY_ENUM.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0   Apr 29, 2015      Siva Nagaraju	       Initial Version
/ ********************************************************************/
package com.beingjavaguys.common.enums;

public enum REPAYMENT_FREQUENCY_ENUM {
	
	MONTHLY("Bi-Weekly"),
	BIWEEKLY("Monthly"),
	QUARTERLY("Quarterly");
	
	private String desc;
	
	REPAYMENT_FREQUENCY_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
	

}
