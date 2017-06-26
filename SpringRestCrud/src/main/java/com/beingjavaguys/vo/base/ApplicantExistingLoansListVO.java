/*************************************************************************
* Copyright (C) 2017
* ACG
* All Rights Reserved 
*
* File: CustomerExistingLoansListVO.java  
*************************************************************************
* Ver     Date          Name                      Description
* --- ------- ------------ ----------------------------------------------
* 0.1    Apr 4, 2017   RamPrasad                   Initial version
*
*********************************************** ***************************/
package com.beingjavaguys.vo.base;

import java.util.List;

/**
 * @author p78031
 *
 */
public class ApplicantExistingLoansListVO extends BankBaseVO {
	
	private List<ApplicantExistingLoansVO> applicantLoans ;
	

	public ApplicantExistingLoansListVO() {
	}


	/**
	 * @return the applicantLoans
	 */
	public List<ApplicantExistingLoansVO> getApplicantLoans() {
		return applicantLoans;
	}


	/**
	 * @param applicantLoans the applicantLoans to set
	 */
	public void setApplicantLoans(List<ApplicantExistingLoansVO> applicantLoans) {
		this.applicantLoans = applicantLoans;
	}
	
}
