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

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import com.beingjavaguys.model.Address;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.provider.ICustomerDataProvider; 

@Component
@Scope("request")
public class EmployeeProcessor {

	/*@Autowired
	DataDao dataDao;*/
	
	public static final Logger logger = Logger.getLogger(EmployeeProcessor.class);
	
	 @Autowired
	protected ICustomerDataProvider loginUserDataProvider;
 

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
	public List<Employee> getEmployeeDetails() throws Exception  {
		try {
			List<Employee> customers = new ArrayList();
			customers.add(new Employee(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
			customers.add(new Employee(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
			customers.add(new Employee(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
			customers.add(
					new Employee(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
			return customers;
			
		} catch (DataAccessException e) {  
			 return null;
		}
	}
	
	

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
	public Address getAddressDetailsById(Long id) throws Exception  {
		try { 
			
			 return null;
		/*	return dataDao.getAddressById(id);*/
			 
			
		} catch (DataAccessException e) {  
			 return null;
		}
	}
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
	public List<Address> getAddressDetails() throws Exception  {
		try { 
			
			return loginUserDataProvider.findAll();
			/* return dataDao.getAddressList();*/
			/*List<Employee> customers = new ArrayList();
			customers.add(new Employee(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
			customers.add(new Employee(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
			customers.add(new Employee(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
			customers.add(new Employee(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
			*/
			//return customers;
			
		} catch (DataAccessException e) {  
			 return null;
		}
	}
	

}// Class