/********************************************************************
* ACG
* All Rights Reserved 
*
* File: ILogExceptionService.java
********************************************************************
*
*  Ver   	  Date              Author             Description
*  ==== 	 ========        ============       ==================
*  0.1  	Jun 18, 2015         KulaSekhar           Created
/ ********************************************************************/
package com.beingjavaguys.base;

import org.springframework.stereotype.Component;

import com.beingjavaguys.vo.base.BankBaseVO;

@Component
public interface ILogExceptionService {
	
	void logException(BankBaseVO baseVo,String eventName, Throwable error);

}
