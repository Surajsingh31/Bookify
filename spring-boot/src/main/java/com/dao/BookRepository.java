package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.model.Book;
import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("from Book b where b.bookName = :bookName")
	Book getByName(@Param("bookName") String bookName);

    @Query("from Book b where b.genre = :genre")
    List<Book> getBooksByGenre(@Param("genre") String genre);

    @Query("from Book b order by b.price asc")
    List<Book> getAllBooksByPriceAsc();

    @Query("from Book b order by b.price desc")
    List<Book> getAllBooksByPriceDesc();

    @Query("from Book b where b.genre = :genre order by b.price asc")
    List<Book> getBooksByPrice(@Param("genre") String genre);

    @Query("from Book b where b.genre = :genre order by b.price desc")
    List<Book> getBooksByPriceHigh(@Param("genre") String genre);

    @Query("from Book b where b.genre = :genre order by b.bookName asc")
    List<Book> getBooksByAlphabet(@Param("genre") String genre);

    @Query("from Book b where b.genre = :genre order by b.bookName desc")
    List<Book> getBooksByAlphabetDesc(@Param("genre") String genre);

    @Query("from Book b order by b.bookName asc")
    List<Book> getAllBooksByAlphabetAsc();

    @Query("from Book b order by b.bookName desc")
    List<Book> getAllBooksByAlphabetDesc();

    
}