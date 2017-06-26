/********************************************************************
* ACG
* All Rights Reserved 
*
* File: BankLosBusinessException.java
********************************************************************
*
*  Ver   	  Date              Author             Description
*  ==== 	 ========        ============       ==================
*  0.1  	Jul 1, 2015         KulaSekhar           Created
/ ********************************************************************/
package com.beingjavaguys.common.exception;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.beingjavaguys.vo.api.ErrorDetailVO;


public class BankLosBusinessException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String ui;
	private String status;
	private String channel;
	private BindingResult result;
	private List<ErrorDetailVO> errors;
	private String field;
	private Integer code;
	
	public BankLosBusinessException(Integer code, String field ,String desc, List<ErrorDetailVO> errors) {
		this.code = code;
		this.field = field;
		this.status = desc;
		this.errors = errors;
	}
	public BankLosBusinessException(Integer code, String field ,String desc) {
		this.code = code;
		this.field = field;
		this.status = desc;
	}
	public BankLosBusinessException(Integer code, String field ,String desc,String message, Throwable cause) {
		super(message,cause);
		this.code = code;
		this.field = field;
		this.status = desc;
	}
	public BankLosBusinessException(BindingResult result){
		super();

		this.result = result;
		
	}
	
	public BankLosBusinessException(){
		super();

	}
	public BankLosBusinessException(Exception ex){
		super(ex);
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the ui
	 */
	public String getUi() {
		return ui;
	}
	/**
	 * @param ui the ui to set
	 */
	public void setUi(String ui) {
		this.ui = ui;
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
	 * @return the channel
	 */
	public String getChannel() {
		return channel;
	}
	/**
	 * @param channel the channel to set
	 */
	public void setChannel(String channel) {
		this.channel = channel;
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
	public List<ErrorDetailVO> getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(List<ErrorDetailVO> errors) {
		this.errors = errors;
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

	
	

}
