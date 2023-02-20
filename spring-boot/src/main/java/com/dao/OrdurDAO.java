package com.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Ordur;

@Service
public class OrdurDAO {

    @Autowired
    private OrdurRepository orderRepository;

    public List<Ordur> findAllOrders() {
        return orderRepository.findAll();
      }

    public List<Ordur> findOrdersByOrderDate(Date orderDate) {
        return orderRepository.findOrdersByOrderDate(orderDate);
    }

    public List<Ordur> findOrdersByAddress(String address) {
        return orderRepository.findOrdersByAddress(address);
    }

    public List<Ordur> findOrdersByAmount(double amount) {
        return orderRepository.findOrdersByAmount(amount);
    }


    public Ordur findOrderByOrderId(int orderId) {
        return orderRepository.findOrderByOrderId(orderId);
    }

    public List<Ordur> findOrderByCustId(int custId) {
        return orderRepository.findOrderByCustId(custId);
    }

    public void deleteOrder(int orderId){
        orderRepository.deleteById(orderId);
    }
}