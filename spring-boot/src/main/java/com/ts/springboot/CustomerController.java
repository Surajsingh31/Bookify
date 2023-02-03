package com.ts.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dao.CustomerDAO;
import com.model.Customer;

@RestController
public class CustomerController{

    @Autowired
    CustomerDAO custDAO;

    @GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers(){
		return custDAO.getAllCustomer();
	}
    
}
