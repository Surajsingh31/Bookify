package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Donation;

public interface DonationRepository extends JpaRepository <Donation,Integer> {

	  
		@Query("from Donation d where d.custName = :custName")
		Donation getByName(@Param("custName") String custName);
}

