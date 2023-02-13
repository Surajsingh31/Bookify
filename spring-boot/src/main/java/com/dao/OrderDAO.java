package com.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Order;

@Service
public class OrderDAO {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
      }

    public List<Order> findOrdersByOrderDate(Date orderDate) {
        return orderRepository.findOrdersByOrderDate(orderDate);
    }

    public List<Order> findOrdersByAddress(String address) {
        return orderRepository.findOrdersByAddress(address);
    }

    public List<Order> findOrdersByAmount(double amount) {
        return orderRepository.findOrdersByAmount(amount);
    }


    public Order findOrderByOrderId(int orderId) {
        return orderRepository.findOrderByOrderId(orderId);
    }

    public void deleteOrder(int orderId){
        orderRepository.deleteById(orderId);
    }
}