package com.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

	@Query("SELECT o FROM Order o WHERE o.orderDate = :orderDate")
	List<Order> findOrdersByOrderDate(Date orderDate);

	@Query("SELECT o FROM Order o WHERE o.address = :address")
	List<Order> findOrdersByAddress(String address);

	@Query("SELECT o FROM Order o WHERE o.amount = :amount")
	List<Order> findOrdersByAmount(double amount);

	@Query("SELECT o FROM Order o WHERE o.orderId = :orderId")
	Order findOrderByOrderId(int orderId);

}

    

