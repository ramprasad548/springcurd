/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: NoSuchApplicationException.java
 ********************************************************************
 *
 *  Ver   	 Date            Author             Description
 *  ==== 	 ========        ============       ==================
 *  0.1  	 Aug 14, 2015    Sreeram	        Intial version
/ ********************************************************************/
package com.beingjavaguys.common.exception;

@SuppressWarnings("serial")
public class NoSuchApplicationException extends RuntimeException {
	
	private long appId;
	
	public NoSuchApplicationException() {
        super();
    }

    public NoSuchApplicationException(String message, long appId) {
        super(message);
        this.appId = appId;
    }

    public NoSuchApplicationException(String message, long appId, Throwable cause) {
        super(message, cause);
        this.appId = appId;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + " for appId :" + appId;
    }
}
