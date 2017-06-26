/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: BankBaseVO.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Mar 30, 2015   Sreeram                   Initial version
* 0.2    Apr 14, 2015   Ramarao                   Added ApiStatuss Object
*
*********************************************** ***************************/
package com.beingjavaguys.vo.base;

import com.beingjavaguys.vo.api.APIStatusVO;

public class BankBaseVO {
	
	private KeyIdentifierVO identifier;
	private APIStatusVO apiStatus;

	public BankBaseVO() {
		super();
		apiStatus = new APIStatusVO();
	}
	
	public BankBaseVO(String ui) {
		this.identifier = new KeyIdentifierVO(ui);
		apiStatus = new APIStatusVO();
	}
	public BankBaseVO(String ui, Long appId, String tranId, String channel, String status) {
		this.identifier= new KeyIdentifierVO(ui,appId,tranId,channel,status);
	}
	public BankBaseVO(String ui, String tranId) {
		this.identifier= new KeyIdentifierVO(ui,tranId);
		apiStatus = new APIStatusVO();
	}
	public BankBaseVO(String ui, Long appId, String tranId, String status) {
		this.identifier= new KeyIdentifierVO(ui,appId,tranId,status);
	}
	public BankBaseVO(Long appId, String tranId, String status) {
		this.identifier= new KeyIdentifierVO(appId,tranId,status);
	}
	public BankBaseVO(Integer errorCode,String field, String errorMsg) {
		apiStatus = new APIStatusVO(errorCode,field,errorMsg);
	}
	/**
	 * @return the keyIdentifier
	 */
	public KeyIdentifierVO getIdentifier() {
		if (this.identifier == null)
			this.identifier = new KeyIdentifierVO();
		return identifier;
	}

	/**
	 * @param keyIdentifier the keyIdentifier to set
	 */
	public void setIdentifier(KeyIdentifierVO keyIdentifier) {
		this.identifier = keyIdentifier;
	}

	/**
	 * @return the apiStatus
	 */
	public APIStatusVO getApiStatus() {
		return apiStatus;
	}

	/**
	 * @param apiStatus the apiStatus to set
	 */
	public void setApiStatus(APIStatusVO apiStatus) {
		this.apiStatus = apiStatus;
	}


	/* (non-Javadoc)
	 * @see com.acg.bank.los.vo.base.BankBaseVO#toString()
	 */
	@Override
	public String toString() {
		String input = "{'identifier':{'ui':" +this.getIdentifier().getUi() +
									",'appId':" +this.getIdentifier().getAppId() +
									",'tranId':" +this.getIdentifier().getTranId() +
									"'channel':" +this.getIdentifier().getChannel()+
									",'status':" +this.getIdentifier().getStatus() +
									",'user':" +this.getIdentifier().getUser() +
									"}";
		return input ;
	}

}