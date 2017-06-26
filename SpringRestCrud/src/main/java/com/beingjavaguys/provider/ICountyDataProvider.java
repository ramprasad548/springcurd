package com.beingjavaguys.provider;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.beingjavaguys.model.Country; 

@Repository
public interface ICountyDataProvider extends JpaRepository<Country, Serializable> {
	
	@Query( " from Country")
	Country findPartyByPartyId(Long partyId);
}
