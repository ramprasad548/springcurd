 

/********************************************************************

* ACG

* All Rights Reserved 

*

* File: CRIF_ENDPOINT_ENUM.java

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
public enum CRIF_ENDPOINT_ENUM {
	
	CREATE_APP("/createApp"),ADD_APPLICANT(""),ADD_COLLATERAL(""),ADD_PRODUCT(""),SEND_TO_DECISION(""),GENERATE_DOC(""),GET_DOC(""),GET_FILE("");
	
	
	private String endpoint;

	/**
	 * @return the endpoint
	 */
	public String getEndpoint() {
		return endpoint;
	}

	/**
	 * @param endpoint
	 */
	private CRIF_ENDPOINT_ENUM(String endpoint) {
		this.endpoint = endpoint;
	}
	
	

}
