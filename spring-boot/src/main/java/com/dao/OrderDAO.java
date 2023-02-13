package com.dao;

import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Order;

@Service
public class OrderDAO {
    
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public  Order getOrder(int orderId){
        return orderRepository.findById(orderId).orElse(null);
    }

    public Order registerOrder(Order order){
        return orderRepository.save(order);
    }

    // public Order getOrderByDate(Date date){
    //     return orderRepository.findByDateOrder(date).orElse(null);
    // }

    public void deleteOrder(int orderId){
        orderRepository.deleteById(orderId);
    }
}
