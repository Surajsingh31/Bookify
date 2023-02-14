package com.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.EBook;

public interface EbookRepository extends JpaRepository<EBook,Integer> {

    @Query("from EBook eb where eb.eBookName = :eBookName")
	EBook getByName(@Param("eBookName") String eBookName);

    @Query("from EBook eb where eb.genre = :genre")
    List<EBook> getEBooksByGenre(@Param("genre") String genre);

    @Query("from EBook eb order by eb.price asc")
    List<EBook> getAllEBooksByPriceAsc();

    @Query("from EBook eb order by eb.price desc")
    List<EBook> getAllEBooksByPriceDesc();

    @Query("from EBook eb where eb.genre = :genre order by eb.price asc")
    List<EBook> getEBooksByPrice(@Param("genre") String genre);

    @Query("from EBook eb where eb.genre = :genre order by eb.price desc")
    List<EBook> getEBooksByPriceHigh(@Param("genre") String genre);

    @Query("from EBook eb where eb.genre = :genre order by eb.eBookName asc")
    List<EBook> getEBooksByAlphabet(@Param("genre") String genre);

    @Query("from EBook eb where eb.genre = :genre order by eb.eBookName desc")
    List<EBook> getEBooksByAlphabetDesc(@Param("genre") String genre);

    @Query("from EBook eb order by eb.eBookName asc")
    List<EBook> getAllEBooksByAlphabetAsc();

    @Query("from EBook eb order by eb.eBookName desc")
    List<EBook> getAllEBooksByAlphabetDesc();
    
}