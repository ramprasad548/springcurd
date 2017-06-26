package com.beingjavaguys.vo.api;

import java.util.ArrayList;
import java.util.List;

public class APIStatusVO {

	private Integer code;
	private List<ErrorDetailVO> error = new ArrayList<ErrorDetailVO>();
	
	/**
	 * 
	 */
	public APIStatusVO() {
		this.code = 200;
	}

	/**
	 * @param code
	 */
	public APIStatusVO(Integer code) {
		super();
		this.code = code;
	}
	/**
	 * @param code
	 */
	public APIStatusVO(Integer code,String field,String errorMsg) {
		this.code = 900;
		ErrorDetailVO errorObj = new ErrorDetailVO(code,field,errorMsg);
		error.add(errorObj);
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

	

	/**
	 * @return the error
	 */
	public List<ErrorDetailVO> getError() {
		return error;
	}






	/**
	 * @param error the error to set
	 */
	public void setError(List<ErrorDetailVO> error) {
		this.error = error;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() { 
		return ""+error.toArray();
	}

	

}
