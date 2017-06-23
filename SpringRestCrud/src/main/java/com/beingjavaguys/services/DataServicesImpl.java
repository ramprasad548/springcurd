package com.beingjavaguys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.beingjavaguys.dao.DataDao;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.processor.EmployeeProcessor;

public class DataServicesImpl implements DataServices {

	@Autowired
	DataDao dataDao;
	@Autowired
	EmployeeProcessor employeeProcessor;
	
	@Override
	public boolean addEntity(Employee employee) throws Exception {
		return dataDao.addEntity(employee);
	}

	@Override
	public Employee getEntityById(long id) throws Exception {
		return employeeProcessor.getEmployeeDetailsById(id);
	}

	@Override
	public List<Employee> getEntityList() throws Exception {
		return dataDao.getEntityList();
	}

	@Override
	public boolean deleteEntity(long id) throws Exception {
		return dataDao.deleteEntity(id);
	}

}
