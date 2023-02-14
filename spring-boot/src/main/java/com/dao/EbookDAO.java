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

    public List<EBook> getEBooksByGenre(String genre){
        return eBookRepository.getEBooksByGenre(genre);
    }
    public List<EBook> getEBooksByPrice(String genre){
        if(genre == "All"){
            return eBookRepository.getAllEBooksByPriceAsc();
        }
        return eBookRepository.getEBooksByPrice(genre);
    }
    public List<EBook> getEBooksByPriceHigh(String genre){
        if(genre == "All"){
            return eBookRepository.getAllEBooksByPriceDesc();
        }
        return eBookRepository.getEBooksByPriceHigh(genre);
    }
    public List<EBook> getEBooksByAlphabet(String genre){
        if(genre == "All"){
            return eBookRepository.getAllEBooksByAlphabetAsc();
        }
        return eBookRepository.getEBooksByAlphabet(genre);
    }
    public List<EBook> getEBooksByAlphabetDesc(String genre){
        if(genre == "All"){
            return eBookRepository.getAllEBooksByPriceDesc();
        }
        return eBookRepository.getEBooksByAlphabetDesc(genre);
    }

    public EBook registereBook(EBook eBook){

        return eBookRepository.save(eBook);
    }

    public void deleteeBookById(int eBookId){
        eBookRepository.deleteById(eBookId);
    }
    
}