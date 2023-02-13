package com.ts.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import com.dao.OrderDAO;
import com.model.Order;


@RestController
public class OrderController {

    @Autowired
    OrderDAO orderDAO;

    @RequestMapping("/showAllOrders")
    public List<Order> showAllOrders(){
        List<Order> orderList=orderDAO.findAllOrders();
        return orderList;
    }

    @GetMapping("/getOrderById/{orderId}")
    public Order getOrderById(@PathVariable("orderId") int orderId){
        Order order = orderDAO.findOrderByOrderId(orderId);
        if(order!=null)
            return order;

        return new Order();
    }


    @RequestMapping("/getOrderByDate/{orderDate}")
    public List<Order> getOrderByDate(@PathVariable("orderDate") Date orderDate){
        List<Order> order=orderDAO.findOrdersByOrderDate(orderDate);
        if(order!=null)
            return order;
            
        return (List<Order>) new Order();
    }
    
}
