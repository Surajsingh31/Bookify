package com.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.model.Ordur;

public interface OrdurRepository extends JpaRepository<Ordur, Integer> {

	@Query("SELECT o FROM Ordur o WHERE o.orderDate = :orderDate")
	List<Ordur> findOrdersByOrderDate(Date orderDate);

	@Query("SELECT o FROM Ordur o WHERE o.address = :address")
	List<Ordur> findOrdersByAddress(String address);

	@Query("SELECT o FROM Ordur o WHERE o.amount = :amount")
	List<Ordur> findOrdersByAmount(double amount);

	@Query("SELECT o FROM Ordur o WHERE o.ordId = :ordId")
	Ordur findOrderByOrderId(int ordId);

	@Query("SELECT o FROM Ordur o JOIN o.customer c WHERE c.custId = :custId")
	List<Ordur> findOrderByCustId(int custId);

}