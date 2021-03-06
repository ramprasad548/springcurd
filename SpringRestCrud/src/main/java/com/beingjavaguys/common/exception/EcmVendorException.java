/********************************************************************
* ACG
* All Rights Reserved 
*
* File: BankLosException.java
********************************************************************
*
*  Ver   Date              Author             Description
*  ====  ========          ============       ==================
*  0.1  Feb 2, 2015        Vamsi              Created
/********************************************************************/
package com.beingjavaguys.common.exception;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.beingjavaguys.common.enums.ERROR_CODE_ENUM;
import com.beingjavaguys.common.enums.VENDOR_ERROR_CODE_ENUM;


@SuppressWarnings("serial")
public class EcmVendorException extends Exception {
	
	private VENDOR_ERROR_CODE_ENUM vendorErrorCode;
	private ERROR_CODE_ENUM errorCode;
	 
	private String status; 
	private BindingResult result;
	private List<String> errors;
	
	public EcmVendorException(VENDOR_ERROR_CODE_ENUM errorCode,List<String> errors){
		this.vendorErrorCode = errorCode;
		this.errors = errors;
	}
	
	public EcmVendorException(ERROR_CODE_ENUM errorCode,List<String> errors){
		this.errorCode = errorCode;
		this.errors = errors;
	}
	public EcmVendorException(ERROR_CODE_ENUM errorCode,String message, Throwable cause){
		super(message, cause);
		this.errorCode = errorCode;
	}
	
	public EcmVendorException(VENDOR_ERROR_CODE_ENUM errorCode, String message, Throwable cause){
		super(message, cause);
		this.vendorErrorCode = errorCode;
	}
	
	public EcmVendorException(Exception ex){
		super(ex);
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

	/**
	 * @return the errorCode
	 */
	public ERROR_CODE_ENUM getErrorCode() {
		return errorCode;
	}

	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(ERROR_CODE_ENUM errorCode) {
		this.errorCode = errorCode;
	}
	

}
