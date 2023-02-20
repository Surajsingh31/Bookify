package com.ts.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DonationDAO;
import com.model.Customer;
import com.model.Donation;

@CrossOrigin
@RestController
public class DonationController {


    @Autowired
    DonationDAO dustDAO;
    
   
    
    @GetMapping("/getAllDonor")
	public List<Donation> getAllDonor(){
		return dustDAO.getAllDonor();
	}
    
    


    @PostMapping("/registerDonor")
	public String registerDonor(@RequestBody Donation cust) {

    	Donation cust1 = dustDAO.registerDonor(cust);

		if (cust1 != null)
			return "Customer Donor Registered into the Database";

		return "Customer Donor Registeration Failed!!!";
	}



    @DeleteMapping("/deleteDonorById/{custId}")
    public String deleteCustomerByCustId(@PathVariable("custId") int custId){
		
    	dustDAO.deleteDonorById(custId);
		return "Customer with id: " + custId + " deleted Successfully";
	}
}

