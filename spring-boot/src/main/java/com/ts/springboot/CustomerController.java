package com.ts.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @GetMapping("/getCustomerById/{custId}")
	public Customer getCustomerById(@PathVariable("custId") int customerId){
		Customer cust = custDAO.getCustomerById(customerId);
		if(cust != null){
			return cust;
		}
		return new Customer(0,"Student Not Found","","","","","","",000000,"","","",0);
	}

    @GetMapping("/getCustomerByName/{custName}")
    public Customer getCustomerByName(@PathVariable("custName") String customerName){
        Customer cust = custDAO.getCustomerByName(customerName);
        if(cust != null)
            return cust;

        return new Customer(0,"Student Not Found","","","","","","",000000,"","","",0);
    }

    @PostMapping("/registerCustomer")
	public String registerCustomer(@RequestBody Customer cust) {

		Customer cust1 = custDAO.registerCustomer(cust);

		if (cust1 != null)
			return "Customer Registered into the Database";

		return "Customer Registeration Failed!!!";
	}

    @PutMapping("/updateCustomer")
    public String updateCustomer(@RequestBody Customer cust){

        Customer cust1 = custDAO.registerCustomer(cust);

		if (cust1 != null)
			return "Customer Updated into the Database";

		return "Customer Updation Failed!!!";

    }

    @DeleteMapping("/deleteCustomerByCustId/{custId}")
    public String deleteCustomerByCustId(@PathVariable("custId") int custId){
		
		custDAO.deleteCustomerById(custId);
		return "Customer with id: " + custId + " deleted Successfully";
	}

    
}
