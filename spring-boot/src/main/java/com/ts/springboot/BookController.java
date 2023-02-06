package com.ts.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.dao.BookDAO;
import com.model.Book;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookDAO bookDAO;

    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks(){
        return bookDAO.getAllBooks();
    }

    @GetMapping("/getBookById/{bookId}")
    public Book getBookById(@PathVariable("bookId") int bookId){

        return bookDAO.getBookById(bookId);
    }

    @GetMapping("/getBookByName/{bookName}")
    public Book getBookByName(@PathVariable("bookName") String bookName){

        return bookDAO.getBookByName(bookName);
    }

    @PostMapping("/registerBook")
    public String registerBook(@RequestBody Book book){

        Book book1 = bookDAO.registerBook(book);

        if(book1 != null)
            return "Book Registered into the Database";
        return "Book registration Failed!!!";

    }

    @PutMapping("/updateBook")
    public String updateBook(@RequestBody Book book){

        Book book1 = bookDAO.registerBook(book);

        if(book1 != null)
            return "Book Updated into the Database";
        return "Book Updation Failed!!!";

    }

    @DeleteMapping("/deleteBookById/{bookId}")
    public String deleteBookById(@PathVariable("bookId") int bookId){

        bookDAO.deleteBookById(bookId);
        return "Book with id: " + bookId + " deleted Successfully";
        
    }


    
}