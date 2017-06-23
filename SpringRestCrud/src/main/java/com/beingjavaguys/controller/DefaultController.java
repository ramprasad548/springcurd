package com.beingjavaguys.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.beingjavaguys.common.OscarURIConstants;
import com.beingjavaguys.model.Address;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.model.Status;
import com.beingjavaguys.services.DataServices; 

@RestController
@Scope("request") 
public class DefaultController {

	@Autowired
	DataServices dataServices; 

	static final Logger logger = Logger.getLogger(DefaultController.class);

	@RequestMapping(value = "/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Status addEmployee(@RequestBody Employee employee) {
		try {
			dataServices.addEntity(employee);
			return new Status(1, "Employee added Successfully !");
		} catch (Exception e) {
			// e.printStackTrace();
			return new Status(0, e.toString());
		}

	}
	 /**
     * This service used to get the party details  by passing the loginId
     * @param loginId
     * @param req
     * @param response
     * @param ucBuilder
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws BankLosException
     * @throws BankLosBusinessException
     */
	@RequestMapping(value = OscarURIConstants.GET_PARTY, method = RequestMethod.GET, produces={"application/json"})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public  List<Employee> getPartyDetailsByLoginId()  throws JsonParseException, JsonMappingException,Exception
	{
		 return dataServices.getEntityList();

	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody
	Employee getEmployee(@PathVariable("id") long id)  {
		Employee employee = null;
		try {
			employee = dataServices.getEntityById(id);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public @ResponseBody
	List<Employee> getEmployee() {

		List<Employee> employeeList = null;
		try {
			employeeList = dataServices.getEntityList();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return employeeList;
	}

	@RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
	public @ResponseBody
	Status deleteEmployee(@PathVariable("id") long id) {

		try {
			dataServices.deleteEntity(id);
			return new Status(1, "Employee deleted Successfully !");
		} catch (Exception e) {
			return new Status(0, e.toString());
		}

	}
	
	 /**
     * This service used to get the party details  by passing the loginId
     * @param loginId
     * @param req
     * @param response
     * @param ucBuilder
     * @return
	 * @throws Exception 
     * @throws BankLosException
     * @throws BankLosBusinessException
     */
	@RequestMapping(value = OscarURIConstants.GET_Address, method = RequestMethod.GET, produces={"application/json"})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public  Address getAddressDetailsByLoginId(@PathVariable("id") long id)  throws JsonParseException, JsonMappingException,Exception
	{
		Address address = dataServices.getAddress(id);
		
		 return address;

	}
	
	 /**
     * This service used to get the party details  by passing the loginId
     * @param loginId
     * @param req
     * @param response
     * @param ucBuilder
     * @return
     * @throws JsonParseException
     * @throws JsonMappingException
     * @throws BankLosException
     * @throws BankLosBusinessException
     */
	@RequestMapping(value = OscarURIConstants.GET_ADDRESS_LIST, method = RequestMethod.GET, produces={"application/json"})
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public  List<Address> getAddressList()  throws JsonParseException, JsonMappingException,Exception
	{
		 return dataServices.getAddressList();

	}
}
