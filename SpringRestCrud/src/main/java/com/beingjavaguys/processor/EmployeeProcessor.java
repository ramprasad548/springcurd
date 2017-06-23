/********************************************************************
 * HYNIVA
 * All Rights Reserved 
 *
 * File: PartyProcessor.java
 ********************************************************************
 *
 *  Ver   Date              Author             Description
 *  ====  ========          ============       ==================
 *  1.0   March 20, 2017     KulaSekhar		       Initial Version
/ ********************************************************************/
package com.beingjavaguys.processor;

import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.beingjavaguys.model.Employee;
import com.beingjavaguys.provider.ICustomerDataProvider; 

@Component
@Scope("request")
public class EmployeeProcessor {

	public static final Logger logger = Logger.getLogger(EmployeeProcessor.class);
	
	/*@Autowired
	protected ICustomerDataProvider loginUserDataProvider;*/
 

	/**
	 * Save the party details
	 * 
	 * @param partyVO
	 * @return
	 * @throws BankLosException
	 * @throws BankLosBusinessException
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public Employee getEmployeeDetailsById(Long id) throws Exception  {
		try { 
			
			//Employee employee = loginUserDataProvider.findPartyByPartyId(id);
			//return employee;
			return null;
			
		} catch (DataAccessException e) {  
			 return null;
		}
	}
 

}// Class