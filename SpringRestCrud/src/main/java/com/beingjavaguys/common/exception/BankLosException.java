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

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.BindingResult;

import com.beingjavaguys.vo.api.ErrorDetailVO;


@SuppressWarnings("serial")
public class BankLosException extends Exception {
	
	private Long id;
	private String ui;
	private String status;
	private String channel;
	private BindingResult result;
	private List<ErrorDetailVO> errors;
	private String field = "";
	private Integer code;
	
	public BankLosException(BindingResult result){
		this.result = result;
	}
	public BankLosException(Exception ex){
		super(ex);
	}
	
	public BankLosException(String message, Throwable cause) {
		 super(message, cause);
	}
	public BankLosException(Integer code, String desc) {
		this.code = code;
		this.status = desc;
	}
	public BankLosException(Integer code, String message, Throwable cause) {
		 super(message, cause);
		 this.code = code;
	}
	public BankLosException(Integer code, String desc, String message, Throwable cause) {
		 super(message, cause);
		this.code = code;
		this.status = desc;
	}
	public BankLosException(Integer code, String field ,String desc,String message,Throwable cause) {
		super(message, cause);
		this.code = code;
		this.field = field;
		this.status = desc;
		if(this.errors == null)
		{
			this.errors = new ArrayList<ErrorDetailVO>();
		}
		this.errors.add(new ErrorDetailVO(code,field,desc));
	}
	public BankLosException(String errorCode ,String errors,String message,Throwable cause) {
		super(message, cause);
		this.field = errorCode;
		this.status = errors;
		if(this.errors == null)
		{
			this.errors = new ArrayList<ErrorDetailVO>();
		}
		this.errors.add(new ErrorDetailVO(errorCode,errors));
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
