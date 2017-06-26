 

/********************************************************************

* ACG

* All Rights Reserved 

*

* File: CHANNEL_ENUM.java

********************************************************************

*

*  Ver   Date              Author             Description

*  ====  ========          ============       ==================

*  1.0  Feb 3, 2015            Vamsi                 Created

/ ********************************************************************/
package com.beingjavaguys.common.enums;

/**
 * @author Vamsi
 *
 */
public enum CHANNEL_ENUM {
	
	AAACOM("AAA.COM"),
	BRANCH("BRANCH"),
	POC("POC");
	
	private String desc;
	
	CHANNEL_ENUM(String desc){
		this.desc = desc;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	 
	

}
