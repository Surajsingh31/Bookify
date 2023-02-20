package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.Donation;

@Service
public class DonationDAO {

	 @Autowired
	 
	 DonationRepository  donationRepository ;
	 
	 
	 public List<Donation> getAllDonor() {
			
			return donationRepository.findAll();
		}

	   

	    public Donation registerDonor(Donation cust){
	        return donationRepository.save(cust);
	    }

	    public void deleteDonorById(int custId){

	    	donationRepository.deleteById(custId);

	    }

	
	
}