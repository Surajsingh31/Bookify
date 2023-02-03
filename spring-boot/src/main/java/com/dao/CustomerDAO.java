package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.model.Customer;

@Service
public class CustomerDAO {

    @Autowired
    CustomerRepository custRepository;

    public List<Customer> getAllCustomer() {
		
		return custRepository.findAll();
	}




    
}
