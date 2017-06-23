package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.beingjavaguys.model.Address;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.processor.EmployeeProcessor;

@Service("dataServices")
@Scope("request")
public class DataServicesImpl implements DataServices {

	/*@Autowired
	DataDao dataDao;*/
	@Autowired
	EmployeeProcessor employeeProcessor;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return false;
	/*	return dataDao.addEntity(employee);*/
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		return employeeProcessor.getEmployeeDetailsById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		//return dataDao.getEntityList();
		return employeeProcessor.getEmployeeDetails();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return false;
		/*return dataDao.deleteEntity(id);*/
	}
	
	@Override
	public Address getAddress(long id) throws Exception {
		return employeeProcessor.getAddressDetailsById(id);
	}
	
	@Override
	public List<Address> getAddressList() throws Exception {
		return employeeProcessor.getAddressDetails();
	}

}
