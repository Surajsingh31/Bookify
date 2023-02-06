package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.EBook;

public interface EbookRepository extends JpaRepository<EBook,Integer> {

    @Query("from EBook eb where eb.eBookName = :eBookName")
	EBook getByName(@Param("eBookName") String eBookName);
    
}