package com.beingjavaguys.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.beingjavaguys.model.Address;
import com.beingjavaguys.model.Employee;
import com.beingjavaguys.vo.base.BankBaseVO;
import com.beingjavaguys.vo.base.CountryVOList;

@Component
public interface DataServices {
	public boolean addEntity(Employee employee) throws Exception;
	public Employee getEntityById(long id) throws Exception;
	public List<Employee> getEntityList() throws Exception;
	public boolean deleteEntity(long id) throws Exception;
	public Address getAddress(long id) throws Exception;
	public List<Address> getAddressList() throws Exception;
	
	public BankBaseVO getEntityListVO() throws Exception;
	
	public CountryVOList getCountryListVO() throws Exception;
}
