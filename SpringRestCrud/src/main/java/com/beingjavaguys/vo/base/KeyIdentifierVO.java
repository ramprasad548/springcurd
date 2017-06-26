/*************************************************************************
* Copyright (C) 2015
* ACG
* All Rights Reserved 
*
* File: KeyIdentifier.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 1.0    Apr 1, 2015   KulaSekhar                   Initial version
*********************************************** ***************************/
package com.beingjavaguys.vo.base;

/**
 * @author KulaSekhar
 *This object hold the key attributes of application
 */
public class KeyIdentifierVO {
	
	private String ui;
	private Long appId;
	private String tranId;
	private String channel;
	private String status;
	private String user;

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @param ui
	 * @param appId
	 * @param tranId
	 * @param channel
	 * @param offerCode
	 * @param loanStatus
	 */
	public KeyIdentifierVO(String ui, Long appId, String tranId, String channel, String status) {
		this.ui = ui;
		this.appId = appId;
		this.tranId = tranId;
		this.channel = channel;
		this.status = status;
	}
	
	/**
	 * 
	 */
	public KeyIdentifierVO() {
		
	}
	public KeyIdentifierVO(String ui) {
		this.ui = ui;
	}
	/**
	 * @param ui
	 * @param appId
	 * @param tranId
	 * @param loanStatus
	 */
	public KeyIdentifierVO(String ui, String tranId) {
		this.ui = ui;
		this.tranId = tranId;
	}
	/**
	 * @param ui
	 * @param appId
	 * @param tranId
	 * @param loanStatus
	 */
	public KeyIdentifierVO(Long appId, String tranId, String status) {
		this.appId = appId;
		this.tranId = tranId;
		this.status = status;
	}
	/**
	 * @param ui
	 * @param appId
	 * @param tranId
	 * @param loanStatus
	 */
	public KeyIdentifierVO(String ui, Long appId, String tranId, String status) {
		this.ui = ui;
		this.appId = appId;
		this.tranId = tranId;
		this.status = status;
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
	 * @return the appId
	 */
	public Long getAppId() {
		return appId;
	}

	/**
	 * @param appId the appId to set
	 */
	public void setAppId(Long appId) {
		this.appId = appId;
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
		this.channel = channel.toUpperCase();
	}

	/**
	 * @return the loanStatus
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param loanStatus the loanStatus to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the tranId
	 */
	public String getTranId() {
		return tranId;
	}

	/**
	 * @param tranId the tranId to set
	 */
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	
	
}
