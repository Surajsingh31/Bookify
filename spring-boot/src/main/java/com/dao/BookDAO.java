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