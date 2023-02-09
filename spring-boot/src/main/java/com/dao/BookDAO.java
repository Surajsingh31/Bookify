package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.model.Book;
import java.util.List;

@Service
public class BookDAO {

    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){

        return bookRepository.findAll();

    }

    public Book getBookById(int bookId){

        return bookRepository.findById(bookId).orElse(null);

    }
    public List<Book> getBooksByGenre(String genre){
        return bookRepository.getBooksByGenre(genre);
    }
    public List<Book> getBooksByPrice(String genre){
        if(genre == "All"){
            return bookRepository.getAllBooksByPriceAsc();
        }
        return bookRepository.getBooksByPrice(genre);
    }
    public List<Book> getBooksByPriceHigh(String genre){
        if(genre == "All"){
            return bookRepository.getAllBooksByPriceDesc();
        }
        return bookRepository.getBooksByPriceHigh(genre);
    }
    public List<Book> getBooksByAlphabet(String genre){
        if(genre == "All"){
            return bookRepository.getAllBooksByAlphabetAsc();
        }
        return bookRepository.getBooksByAlphabet(genre);
    }
    public List<Book> getBooksByAlphabetDesc(String genre){
        if(genre == "All"){
            return bookRepository.getAllBooksByPriceDesc();
        }
        return bookRepository.getBooksByAlphabetDesc(genre);
    }

    public Book getBookByName(String bookName){
        return bookRepository.getByName(bookName);
    }

    public Book registerBook(Book book){

        return bookRepository.save(book);
    }

    public void deleteBookById(int bookId){
        bookRepository.deleteById(bookId);
    }
    
}