 /********************************************************************
* ACG
* All Rights Reserved 
*
* File: ERROR_CODE_ENUM.java
********************************************************************
*
*  Ver   Date              Author             Description
*  ====  ========          ============       ==================
*  1.0  Feb 2, 2015            Vamsi                 Created
/ ********************************************************************/
package com.beingjavaguys.common.enums;



/**
 * @author Vamsi
 *
 */
public enum ERROR_CODE_ENUM {

	// 90XX for all Application Info
	APPLICATION_NOT_FOUND(9001,"No such application"),
	APPLICATION_ID_MISSING(9002,"Invalid application Id or missing"),
	APPLICATION_SUBMIT_FAILED(9003,"Application is not submitted"),
	MINIMUM_AGE(9004,"Applicant minimum age should be 18 years"),
	MAXIMUM_AGE(9005,"Applicant age is greater than 100 years"),
	DECISION_DECLINED(9006,"Application is declined"),
	FUNDING_CODE_GEN(9007,"Funding code is generated for this application"),
	SSN_IS_MISSING(9008,"SSN is missing"),
	SSN_VALIDATION_FAILED(9009,"SSN authentication failed"),
	SSN_AUTHENTICATION_EXCEEDED(9010,"SSN verification exceeded"),
	INVALID_SSN_LENGTH(9011,"SSN length should be 9 characters"),
	INVALID_TU_IDENTIFIER(9012,"TU Identifier is missing"),
	INVALID_APPLICATION_STATUS(9013,"Invalid Application Status"),
	UI_NOT_ASSOCIATED_WITH_APP(9014,"Customer UI is not associated with this Application"),
	DEALER_EMAIL_MISSING(9015,"Dealer Email is missing"),
	INCOME_BEFORE_TAXES(9016,"Income Before Taxes should be more than 2 digit"),
	CRIF_APPLICATION_NOT_FOUND(9017,"CRIF Application was not yet created"),
	INVALID_CHANNEL(9018,"Invalid Channel"),
	MISSING_WITHDRAW_REASON(9019,"Withdraw reason is missing"),
	NEBRASKA_MINIMUM_AGE(9020,"Applicant minimum age should be 19 years"),
	INVALID_PHONE_LENGTH(9021,"Phone Number length should be 10 characters"),
	MAXIMUM_HOUSING_MONTHLY_COST(9022,"Monthly housing cost should not be greater than 32000"),
	MAXIMUM_INCOME_BEFORE_TAXES(9023,"Income before taxes should not be greater than 999999999"),
	FUNDING_REQUEST_APPROVED(9024,"Funding Request is Approved"),
	APPLICATION_REVIEW_REQUIRED(9025,"Application is not completed"),
	APPLICATION_ALREADY_DECISIONED(9026,"Application is already Decisioned."),
	ADDRESS_VALIDATION_FAILED(9027,"ITA Customer address validation failed."),
	INVALID_PROPERTY_ADDRESS(9028,"A valid property address is required."),
	
	// 91XX for all Applicant Info
	INVALID_APPLICANT_INFORMATION(9101,"No Applicant data"),
	CUSTOMER_UI_MISSING(9102,"Customer UI is missing"),
	APPLICANT_DOES_NOT_EXIST(9103,"Invalid Applicant Id"),
	UNABLE_TO_FIND_CUSTOMER(9104,"Invalid Customer UI"),
	CUSTOMER_HAS_ACTIVE_APPS(9105,"Customer already has an active application"),
	CUSTOMER_UI_INVALID_LENGTH(9106,"Customer UI does not have the correct character length"),
	INVALID_INCOME_FREQUENCY(9108,"Invalid Income Frequency"),
	INVALID_PHONE_TYPE(9109,"Invalid Phone Type"),
	INVALID_HOUSING_STATUS(9110,"Invalid Housing Status"),
	LOAN_TERMS_DETAILS(9111,"Invalid Loan term or amount to finance or annual interest rate"),
	APPLICATION_NOT_ASSOCIATED(9112,"Customer UI is not associated with the submitted application"),
	CUSTOMER_HAS_MORE_APPS(9113,"Customer have more than one active application"),
	CUSTOMER_DONOT_HAVE_ACTIVE_APPS(9114,"Customer do not have an active application"),
	INVALID_APPLICATION_INFORMATION(9115,"Invalid Application Id"),
	
	// 92XX for all Collateral Info
	COLLATERAL_TYPE_NOT_FOUND(9201,"Collateral Type not found"),
	COLLATERAL_AUTO_TYPE_NOT_FOUND(9202,"Collateral Auto Type not found"),
	COLLATERAL_NOT_FOUND(9203,"No collateral associated to the application"),
	INVALID_AUTO_TYPE(9204,"Invalid Auto Type"),
	INVALID_VIN(9205,"Invalid VIN"),
	INVALID_SUPPORTED_MODEL_YEAR(9206,"Vehicle Model Year is not supported"),
	INVALID_COLLATERAL_MODEL_YEAR(9207,"Invalid Vehicle Model Year"),
	VIN_INVALID_LENGTH(9208,"VIN length should be 17 characters"),
	VEHICLE_NOT_FOUND_IN_NADA(9209,"Vehicle not found in NADA Vendor"),
	INVALID_MSRP(9210,"Retail value should not be less than 5000"),
	INVALID_SELECTED_AUTO_TYPE(9211,"Selected type of car is not matched with given VIN"),
	
	//93XX for all Offer Info
	OFFER_IS_NOT_ACCEPTED(9301,"Offer is not accepted "),
	SELECTED_OFFER_NOT_SAVED(9302,"Selected Offer is not saved "),
	OFFER_INVALID_STATUS(9303,"Invalid Offer Status"),
	OFFER_NOT_ASSOCIATED(9304,"Offer is not associated with this customer"),
	OFFER_CODE_MISSING(9305,"Offer Code is missing"),
	TERMS_NOT_FOUND(9306,"No Auto pricing terms are in the database"),
	OFFER_NOT_FOUND(9307,"Offer Not Found "),
	OFFER_IS_NOT_SELECTED(9308,"Offer is not selected"),
	OFFER_NOT_FOUND_CUSTOMER(9309,"Customer UI is not associated with an offer"),
	OFFER_VARIATION_EMPTY(9310,"Input offer variation is empty"),
	OFFER_HAS_APPLICATIONS(9311,"Offer is associated with more applications and allowed to continue. Suppose to have only one application per offer"),
	CUSTOMER_HAS_MORE_OFFERS(9312,"Customer UI is associated with more than one offer"),
	CUSTOMIZED_AMOUNT_IS_LESS(9313,"Customized Amount is less than 5k"),
	CUSTOMIZED_AMOUNT_MISSING_FROM_OFFER_VARIATION(9314,"Customized Amount is missing from selected Offer"),
	CUSTOMER_HAS_MORE_SELECTED_OFFERS(9315,"Customer UI is associated with more than one Selected offer"),
	OFFER_HAS_MORE_CUSTOMERS(9316,"Offer is associated with more than one Customer"),
	PAYOFF_AMOUNT_IS_LESS(9317,"PayOff Amount is less than 5k"),
	
	//94XX for all Finance Info
	FINANCE_DETAILS_NOT_FOUND(9401,"Finance Details are not found"),
	LOAN_REPAYMENT_VALUES_NOT_FOUND(9402,"No ACH information"),
	EXCEEDED_MAX_LTV(9403,"Exceeded Max Ltv"),
	INVALID_ROUTING_NUMBER(9404,"Invalid Routing Number"),
	INVALID_FIRST_PAYMENT_DATE(9405,"First Payment date should be more than 30 days and should be less than 60 days"),
	LOAN_DISBURSEMENT_VALUES_NOT_FOUND(9406,"No Disbursement information"),
	
	// 95XX for all Loan Agreements Info
	LOAN_AGREEMENTS_NOT_FOUND(9501,"Loan Agreements are not found"),
	NOT_YET_ESIGNED(9502,"User has not yet signed the documents"),
	
	
	//96XX for all Dealer funding
	FUNDING_CODE_MISSING(9601,"Funding Code is missing"),
	VIN_NUMBER_MISSING(9602,"VIN Number is missing"),
	REQUESTED_AMOUNT_EXCEEDED(9603,"Requested Amount is greater than actual loan amount"),
	DEALER_NOT_FOUND(9604,"Dealer not found"),
	DEALER_REPAYMENT_DETAILS_NOT_FOUND(9605,"Dealer Repayment details are not found"),
	INVALID_REQUESTED_AMOUNT_(9606,"Requested Amount is Invalid"),
	
	//97XX for all HELOC info
	PROPERTY_NOT_FOUND(9203,"No Property is associated to the application"),
	PROPERTY_VALUATION_NOT_FOUND(9204,"Property valuation is not found"),
	
	//30XX - For Required Fields Missing.
	INPUT_DATA_EXCEPTION(3001,"Missing mandatory data elements"),
	IDENTIFIER_NOT_FOUND(3002,"Missing Identifier values"),
	UNKNOWN_TYPE_ID(3003,"Unkown Type Id"),
	MISSING_CHALLENGE_ANSWERS(3004,"Missing Challenge answers"),
	MISSING_TU_REFERENCE_NUMBER(3005,"Missing Transunion reference number"),
	
	//40XX all DB issue
	FIELD_LENGTH_GREATER(4001,"Field length greater than the database field size"),
	DUPLICATE_KEY_EXCEPTION(4002,"Duplicate Key Exception"),
	DATA_ACCESS_EXCEPTION(4003,"Data Access Exception"),
	UNCATEGORIZED_EXCEPTION(4004,"Uncategorized Data Access Exception"),
	CANNNOT_CREATE_TRANSCTION_EXCEPTION(4005,"Cannot Create Transaction Exception"),
	DATA_INTEGRITY_VIOLATION_EXCEPTION(4006,"DataIntegrity Violation Exception"),
	OBJECT_OPTIMISTIC_LOCKING_FAILURE_EXCEPTION(4007,"Object Optimistic Locking Failure Exception:Concurrent Data Modification Issue"),
	
	
	
	
	

	//50XX - For Vendor issues.
	THIRD_PARTY_CONNECTOR_EXCEPTION(5000,"Error Occured while connecting to Third Party"),
	CHROME_CONNECTOR_EXCEPTION(5001,"Error Occured while connecting to Chrome Data"),
	NADA_CONNECTOR_EXCEPTION(5002,"Error Occured while connecting to NADA Vendor"),
	CRIF_CONNECTOR_EXCEPTION(5003,"Error Occured while connecting to CRIF Vendor"),
	TU_CONNECTOR_EXCEPTION(5004,"Error Occured while connecting to Transunion Vendor"),
	VOLTAGE_SECURE_CONNECTOR_EXCEPTION(5005,"Error Occured while connecting to Voltage Secure Vendor"),
	TU_AUTHENTICATION_FAILURE_MESSAGE(5006,"TU Authentication Failure message"),
	INVALID_TU_REFERENCE_NUMBER(5007,"Invalid TU reference number"),
	TU_REFERENCE_NUMBER_NOT_ASSOCIATED(5008,"TU reference number is not associated with this Application"),
	INVALID_CRIF_APPID(5009,"Invalid Crif Application Id"),
	ECM_CONNECTOR_EXCEPTION(5010,"Error Occured while connecting to ECM Vendor"),
	APPLICATION_NOT_CREATED_IN_CRIF(5011,"Application is not created in CRIF"),
	TU_IN_SUFFICIENT_DATA(5012,"There is insufficient data available to present challenge questions"),
	PREQUALIFIED_OFFER_NOT_FOUND(5013,"TU has not returned any offer to Customer"),
	TU_IN_SUFFICIENT_PREQUAL_DATA(5012,"There is insufficient data available to return any offer to Customer"),
	
	NULL_POINTER_EXCEPTION(6001,"Nullpointer exception occured"),
	NUMBER_FORMAT_EXCEPTION(6002,"Numberformat exception occured"),
	DATE_FORMAT_EXCEPTION(6003,"Date format exception occured"),
	JIBX_EXCEPTION(6004,"Unable to access binding information-JiBXException"),
	WEB_SERVICE_EXCEPTION(6005,"Unable to access binding information-WebServiceException"),
	NO_SUCH_FIELD_EXCEPTION(6006,"NoSuchFieldException occured"),
	INVOCATION_TARGET_EXCEPTION(6007,"InvocationTargetException occured"),
	ILLEGAL_ARGUMENT_EXCEPTION(6008,"IllegalArgumentException occured"),
	CLASS_CAST_EXCEPTION(6009,"ClassCastException occured"),
	CONVERSION_FAILED_EXCEPTION(6010,"ConversionFailedException occured"),
	CHECK_SUM_GENERATED_EXCEPTION(6011,"ChecksumGenerationFailedException occured"), 
	FILE_NOT_FOUND_EXCEPTION(6012,"FileNotFoundException occured"),
	DOCUMENT_EXCEPTION(6013,"DoucmentException occured"),
	IO_EXCEPTION(6014,"IOException occured"),
	Exception(6015,"Unknown Exception occured");
	
	private Integer errorCode;
	private String errorDesc;
	
	/**
	 * @param errorCode
	 * @param errorDesc
	 */
	private ERROR_CODE_ENUM(int errorCode, String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
		
		
	}
	
	public static ERROR_CODE_ENUM getErrorCodeEnum(String desc){
		ERROR_CODE_ENUM enu = null;
		for(ERROR_CODE_ENUM num: ERROR_CODE_ENUM.values()){
			if(num.getErrorDesc().equalsIgnoreCase(desc)){
				enu = num;
				break;
			}
		}
		return enu;
	}
	
	/**
	 * @param errorCode
	 * @param errorDesc
	 */
	private <T extends Throwable> ERROR_CODE_ENUM(int errorCode, String errorDesc,Class<T> ex) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	   
	}
	
	/**
	 * @return the errorCode
	 */
	public Integer getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}
	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	private ERROR_CODE_ENUM(Integer errorCode, String errorDesc) {
		this.errorCode = errorCode;
		this.errorDesc = errorDesc;
	}
}
