package com.beingjavaguys.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.beingjavaguys.common.OscarURIConstants;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.model.Status;
import com.beingjavaguys.services.DataServices; 

@Controller
@RequestMapping("/employee")
public class RestController {

	@Autowired
	DataServices dataServices;

	static final Logger logger = Logger.getLogger(RestController.class);

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
	public  List<Employee> getPartyDetailsByLoginId()  throws JsonParseException, JsonMappingException
	{
		List<Employee> customers = new ArrayList();
		customers.add(new Employee(101, "John", "Doe", "djohn@gmail.com", "121-232-3435"));
		customers.add(new Employee(201, "Russ", "Smith", "sruss@gmail.com", "343-545-2345"));
		customers.add(new Employee(301, "Kate", "Williams", "kwilliams@gmail.com", "876-237-2987"));
		customers.add(new Employee(System.currentTimeMillis(), "Viral", "Patel", "vpatel@gmail.com", "356-758-8736"));
		
		 return customers;

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
}
