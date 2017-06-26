/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: DISBURSEMENT_STATUS_ENUM.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0   Apr 29, 2015      Siva Nagaraju	       Initial Version
/ ********************************************************************/
package com.beingjavaguys.common.enums;

public enum DISBURSEMENT_STATUS_ENUM {
	
	DISBURSEMENT_INITIATED("DISBURSEMENT_INITIATED"),
	DISBURSEMENT_PENDING("DISBURSEMENT_PENDING"),
	DISBURSEMENT_DISBURSED("DISBURSEMENT_DISBURSED"),
	DISBURSEMENT_DECLINED("DISBURSEMENT_DECLINED"),
	DISBURSEMENT_WITHDRAWN("DISBURSEMENT_WITHDRAWN");;
	
	private String desc;
	
	DISBURSEMENT_STATUS_ENUM(String desc){
			this.desc = desc;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}
		 

}
