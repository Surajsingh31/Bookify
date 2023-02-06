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

    public Customer getCustomerById(int customerId) {
        return custRepository.findById(customerId).orElse(null);
    }

    public Customer getCustomerByName(String customerName){
        return custRepository.getByName(customerName);
    }

    public Customer registerCustomer(Customer cust){
        return custRepository.save(cust);
    }

    public void deleteCustomerById(int custId){

         custRepository.deleteById(custId);

    }




    
}
