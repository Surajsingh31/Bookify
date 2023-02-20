package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.model.Charity;

@Service
public class CharityDAO {

    @Autowired
    CharityRepository charityRepository;

    public List<Charity> getAllCharity(){
        return charityRepository.findAll();
    }

    public Charity getCharityById(int charityId){
        return charityRepository.findCharityById(charityId);
    }
}