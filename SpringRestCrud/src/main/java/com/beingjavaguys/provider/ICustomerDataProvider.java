package com.beingjavaguys.provider;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.model.Address; 

@Repository
public interface ICustomerDataProvider extends JpaRepository<Address, Serializable> {
	
	@Query( " from Address")
	Address findPartyByPartyId(Long partyId);
}
