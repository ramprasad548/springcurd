/********************************************************************
* ACG
* All Rights Reserved 
*
* File: VoltageSecureException.java
********************************************************************
*
*  Ver   	  Date              Author             Description
*  ==== 	 ========        ============       ==================
*  0.1  	Jul 1, 2015         KulaSekhar           Created
/ ********************************************************************/
package com.beingjavaguys.common.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;

import com.beingjavaguys.common.enums.VENDOR_ERROR_CODE_ENUM;

public class VoltageSecureException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private VENDOR_ERROR_CODE_ENUM vendorErrorCode;
	 
	private String status; 
	private BindingResult result;
	private List<String> errors;
	
	public VoltageSecureException(VENDOR_ERROR_CODE_ENUM errorCode, String message, Throwable cause){
		super(message, cause);
		this.vendorErrorCode = errorCode;
		if(this.errors == null)
		{
			this.errors = new ArrayList<String>();
		}
		this.errors.add(message);
	}
	
 
	/**
	 * @return the result
	 */
	public BindingResult getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(BindingResult result) {
		this.result = result;
	}
	/**
	 * @return the errors
	 */
	public List<String> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}

	/**
	 * @return the vendorErrorCode
	 */
	public VENDOR_ERROR_CODE_ENUM getVendorErrorCode() {
		return vendorErrorCode;
	}

	/**
	 * @param vendorErrorCode the vendorErrorCode to set
	 */
	public void setVendorErrorCode(VENDOR_ERROR_CODE_ENUM vendorErrorCode) {
		this.vendorErrorCode = vendorErrorCode;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	

}
