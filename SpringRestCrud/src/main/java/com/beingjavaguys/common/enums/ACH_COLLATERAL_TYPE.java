/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: ACH_COLLATERAL_TYPE.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0   Apr 29, 2015      Siva Nagaraju	       Initial Version
/ ********************************************************************/
package com.beingjavaguys.common.enums;

public enum ACH_COLLATERAL_TYPE {
	
	ACH("ACH"),
	New("New"),
	Used("Used"),
	NEW("NEW"),
	USED("USED");
	
private String desc;
	
ACH_COLLATERAL_TYPE(String desc){
		this.desc = desc;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	 
	

}
