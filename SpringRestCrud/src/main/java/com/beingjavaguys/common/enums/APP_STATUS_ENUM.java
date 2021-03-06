/********************************************************************
 * ACG
 * All Rights Reserved 
 *
 * File: LoanApplicationProcessor.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0   Apr 14, 2015      Ram Prasd J	       Initial Version
/ ********************************************************************/
package com.beingjavaguys.common.enums;

public enum APP_STATUS_ENUM {

	OFFER_GENERATED(1,"OFFER_GENERATED"),
	OFFER_DELIVERED(2,"OFFER_DELIVERED"),
	OFFER_VIEWED(3,"OFFER_VIEWED"),
	OFFER_VARIATION_GENERATED(4,"OFFER_VARIATION_GENERATED"),
	OFFER_VARIATION_SELECTED(5,"OFFER_SELECTED"),
	OFFER_ACCEPTED(6,"OFFER_ACCEPTED"),
	OFFER_DECLINED(7,"OFFER_DECLINED"),
	OFFER_EXPIRED(8,"OFFER_EXPIRED"),
	CHALLENGE_QUESTIONS_REQ(10,"CHALLENGE_QUES_REQUESTED"),
	CHALLENGE_QUESTIONS_FAILED(11,"CHALLENGE_QUESTIONS_REQUEST_FAILED"),
	CHALLENGE_QUESTIONS_REC(12,"CHALLENGE_QUES_RECEIVED"),
	TU_AUTHENTICATION_REQUESTED(13,"TU_AUTHENTICATION_REQUESTED"),
	TU_AUTHENTICATION_FAILED(13,"TU_AUTHENTICATION_FAILED"),
	TU_AUTHENTICATION_SUCCESS(14,"TU_AUTHENTICATION_SUCCESS"),
	APPLICATION_FAILED(15,"APPLICATION_FAILED"),	
	APPLICATION_WITHDRAWN(16,"APPLICATION_WITHDRAWN"),
	COLLATERAL_ADDED(17,"COLLATERAL_ADDED"),
	
	COLLATERAL_REQUEST_FAILED(20,"COLLATERAL_REQUEST_FAILED"),
	CRIF_DECISION_REQUESTED(21,"CRIF_DECISION_REQUESTED"),
	CRIF_DECISION_REQ_FAILED(22,"CRIF_DECISION_REQ_FAILED"),
	DECISION_RECEIVED(25,"DECISION_RECEIVED"),
	APPLICATION_FULFILLMENT(28,"APPLICATION_FULFILLMENT"),
	FINANCE_INFO_ADDED(29,"FINANCE_INFO_ADDED"),
	DOCS_NOT_GENERATED(30,"DOCUMENTS_NOT_GENERATED"),
	DOCS_GENERATED(31,"DOCUMENTS_GENERATED"),
	DOCS_RECEIVED(32,"DOCUMENTS_RECEIVED"),
	DOCS_ESIGN(33,"DOCUMENTS_ESIGNED"),
	FUNDING_CODE_GEN(34,"FUNDING_CODE_GENERATED"),
	SEND_FUNDING_CODE_DEALER(35,"SEND_CODE_TO_DEALER"),
	DEALER_AUTHENTICATION_SUCCESS(36,"DEALER_AUTHENTICATION_SUCCESS"),
	DEALER_AUTHENTICATION_FAILED(37,"DEALER_AUTHENTICATION_FAILED"),
	FUNDING_REQUESTED(38,"REQUESTED"),
	FUNDING_REQUEST_APPROVED(39,"FUNDING_REQUEST_APPROVED"),
	VALIDATE_DEALER(40,"VALIDATE_DEALER"),
	DEALER_VALIDATED(41,"DEALER_VALIDATED"),
	APP_READY_FOR_BOOKING(42,"APP_READY_FOR_BOOKING"),
	BOOKING_COMPLETED(43,"BOOKING_COMPLETED"),
	FUNDING_INITIATED(44,"FUNDING_INITIATED"),
	LOAN_FUNDED(45,"LOAN_FUNDED"),
	STATUS_UNKNOWN(46,"STATUS UNKNOWN"),
	OFFER_ISNOT_DELIVERED(47,"OFFER_IS_NOT_DELIVERED"),
	SSN_AUTHENTICATION_FAILED_1(48,"SSN_AUTHENTICATION_FAILED_1"),
	SSN_AUTHENTICATION_EXCEEDED(49,"SSN_AUTHENTICATION_EXCEEDED"),
	TU_AUTHENTICATION_ATTEMPTS_EXCEEDED(50,"TU_AUTHENTICATION_ATTEMPTS_EXCEEDED"),
	DEALER_SUBMITTED(51,"DEALER_SUBMITTED"),
	DECISION_REVIEW(52,"DECISION_REVIEW"),
	DATA_ACQUISITION(53,"DATA_ACQUISITION"),
	DOCS_GENERATION_FAILED(54,"DOCUMENTS_GENERATION_FAILED"),
	NOTIFY_INSTRUCTIONS_TO_DEALER(55,"NOTIFY_INSTRUCTIONS_TO_DEALER"),
	FUNDING_REQUEST_RECEIVED(56,"FUNDING_REQUEST_RECEIVED"),
	FUNDING_REQUEST_REJECTED(57,"FUNDING_REQUEST_REJECTED"),
	DEALER_NOT_VALIDATED(58,"DEALER_NOT_VALIDATED"),
	APPLICATION_EXPIRED(59,"APPLICATION_EXPIRED"),
	OFFLINE_PROCESS(60,"OFFLINE_PROCESS"),
	TU_AUTHENTICATION_FAILED_1(61,"TU_AUTHENTICATION_FAILED_1"),
	/*
	 * New statuses for Heloc application
	 */
	
	PRE_QUALIFIED_OFFER_GENERATED(62,"PRE_QUALIFIED_OFFER_GENERATED"),
	PROPERTY_INFO_RECEIVED(63,"PROPERTY_INFO_RECEIVED"),
	PROPERTY_VALUATION_NOT_FOUND(64,"PROPERTY_VALUATION_NOT_FOUND"),
	PROPERTY_VALUATION_RECEIVED(65,"PROPERTY_VALUATION_RECEIVED"),
	INITIAL_DISCLOSURES_NOT_GENERATED(66,"INITIAL_DISCLOSURES_NOT_GENERATED"),
	INITIAL_DISCLOSURES_GENERATED(66,"INITIAL_DISCLOSURES_GENERATED"),
	INITIAL_DISCLOSURES_PRESENTED(67,"INITIAL_DISCLOSURES_PRESENTED"),
	DOCUMENTS_UPLOADED_PARTIALLY(68,"DOCUMENTS_UPLOADED_PARTIALLY"),
	DOCUMENTS_UPLOADED(69,"DOCUMENTS_UPLOADED"),
	/**
	 * TODO Application Status cleanup
	 */
	APPLICATION_SUBMITTED(9,"APPLICATION_SUBMITTED"),
	SSN_AUTHENTICATION_FAILED(481,"SSN_AUTHENTICATION_FAILED"),
	SSN_AUTHENTICATION_SUCCESS(482,"SSN_AUTHENTICATION_SUCCESS"),
	TU_AUTHENTICATION(511,"TU_AUTHENTICATION"),
	TU_AUTHENTICATION_BYPASSED(51,"TU_AUTHENTICATION_BYPASSED"),
	DECISION_PENDING(23,"DECISION_PENDING"),
	DECISION_DECLINED(26,"DECISION_DECLINED"),
	DECISION_APPROVED(27,"DECISION_APPROVED"),
	COLLATERAL_RECEIVED(28,"COLLATERAL_RECEIVED"),
	DECISION_READY(24,"DECISION_READY"),
	DECISION_NOT_READY(25,"DECISION_NOT_READY"),
	PRIMARY_APPLICANT_SUBMITTED(26,"PRIMARY_APPLICANT_SUBMITTED"),
	TU_OFFER_ACCEPTED(27,"TU_OFFER_ACCEPTED"),
	EXISTING_LOAN_ADDED(70,"EXISTING_LOAN_ADDED");
	
	private int code;
	private String desc;
	
	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}
	/**
	 * @return the description
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param description the description to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	private APP_STATUS_ENUM(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	 

}
