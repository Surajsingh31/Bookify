package com.dao;

import java.sql.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    
	@Query("from Order o where o.orderName = :orderName")
	Order findByName(@Param("orderName") String orderName);

	@Query("from Order o where o.orderDate = :orderDate")
	Order findByDateOrder(@Param("orderDate") Date orderDate);
    
} 

