package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.EBook;
import java.util.List;

@Service
public class EbookDAO {

    @Autowired
    EbookRepository eBookRepository;

    public List<EBook> getAlleBooks(){

        return eBookRepository.findAll();

    }

    public EBook geteBookById(int eBookId){

        return eBookRepository.findById(eBookId).orElse(null);

    }

    public EBook geteBookByName(String eBookName){
        return eBookRepository.getByName(eBookName);
    }

    public EBook registereBook(EBook eBook){

        return eBookRepository.save(eBook);
    }

    public void deleteeBookById(int eBookId){
        eBookRepository.deleteById(eBookId);
    }
    
}