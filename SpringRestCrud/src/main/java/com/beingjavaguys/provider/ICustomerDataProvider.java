package com.beingjavaguys.provider;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.model.Employee; 

@Repository
public interface ICustomerDataProvider extends JpaRepository<Employee, Serializable> {
	
	@Query( " from Party p where p.id=?1")
	Employee findPartyByPartyId(Long partyId);
}
