package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

    
	@Query("from Customer c where c.custName = :custName")
	Customer getByName(@Param("custName") String custName);
    
} 
