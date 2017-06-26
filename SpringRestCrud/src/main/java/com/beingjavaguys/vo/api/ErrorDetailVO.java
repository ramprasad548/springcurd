/********************************************************************
* ACG
* All Rights Reserved 
*
* File: ErrorDetailVO.java
********************************************************************
*
*  Ver   	  Date              Author             Description
*  ==== 	 ========        ============       ==================
*  0.1  	May 21, 2015         KulaSekhar           Created
/ ********************************************************************/
package com.beingjavaguys.vo.api;



public class ErrorDetailVO {
 
	/**
	 * 
	 */
	public ErrorDetailVO() {
		super();
	}
	/**
	 * @param code
	 * @param message
	 * @param field
	 */
	public ErrorDetailVO(Integer code, String field, String message) {
		this.code = code;
		this.message = message;
		this.field = field;
	}
	public ErrorDetailVO(String code, String message) {
		this.message = message;
		this.field = code;
	}
	private Integer code ;
	private String message;
	private String field;

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the field
	 */
	public String getField() {
		return field;
	}
	/**
	 * @param field the field to set
	 */
	public void setField(String field) {
		this.field = field;
	}
	/**
	 * @return the code
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { 
		return "Error Code:"+code
				+", Field:"+field
				+", Message:"+message;
	}
	
	
}
