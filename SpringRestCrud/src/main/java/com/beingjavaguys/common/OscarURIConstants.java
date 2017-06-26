/********************************************************************
* OSCAR
* All Rights Reserved 
*
* File: LOSURIConstants.java
********************************************************************
*
*  Ver   Date            Author                Description
*  ====  ========        ============          ==================
*  1.0   Apr 11, 2014    Sreeram (P75345)     Created
/********************************************************************/
package com.beingjavaguys.common;


public class OscarURIConstants {
	
	
	
	/**
	 * Get Offer API's
	 */
	//public static final String GET_CUSTOMER_OFFERS="/party/offers/{customerId}";
	public static final String GET_APPLICATION="/party/application/{partyId}";
	public static final String GET_PARTY="/party/{loginId}";
	public static final String STATES="/states";
	public static final String GET_OFFER_VARIATIONS_OFFER_CODE="/offer/variations/{code}";
	public static final String GET_PARTY_OFFERS_PARTY_ID="/party/offers/{partyId}";
	public static final String GET_PARTY_PROSPECT_OFFER="/part/prospect/offer/{partyId}";
	public static final String GET_Address="/address/{loginId}";
	public static final String GET_ADDRESS_LIST="/address";
	public static final String GET_COUNTRY="/country";
	
	
	
	/**
	 *  POST API's
	 */
	public static final String SAVE_PARTY_OFFER="/offer";
	public static final String SAVE_PARTY="/party/submit";
	public static final String SEND_OTP="/sendOTP";
	public static final String OTP_VERIFICATION="/otpVerification";
	public static final String UPDATE_PROFILE="/profile/update";
	public static final String EMAIL_UNSUBSCRIBE="/email/unsubscribe";

}
