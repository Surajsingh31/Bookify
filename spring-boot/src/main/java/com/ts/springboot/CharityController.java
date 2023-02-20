package com.ts.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.model.Charity;
import com.dao.CharityDAO;

@RestController
public class CharityController {
    
    @Autowired
    CharityDAO charityDAO;
    

    @GetMapping("/getAllCharity")
    public List<Charity> getAllCharity(){
        return charityDAO.getAllCharity();
    }

    @GetMapping("/getCharityById/{charityId}")
    public Charity getCharityById(@PathVariable("charityId") int charityId){
        Charity charity=charityDAO.getCharityById(charityId);
        if(charity!=null)
            return charity;
        return new Charity(charityId, null, null, null, charityId, null);
    }

}