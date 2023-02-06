package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

    @Query("from Book b where b.bookName = :bookName")
	Book getByName(@Param("bookName") String bookName);
    
}