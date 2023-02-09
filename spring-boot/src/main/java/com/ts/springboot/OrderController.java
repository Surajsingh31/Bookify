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

    @RequestMapping("/showOrders")
    public List<Order> showAllOrders(){
        List<Order> orderList=orderDAO.getAllOrders();
        return orderList;
    }

    @GetMapping("/getOrderById/{orderId}")
    public Order getOrderById(@PathVariable("orderId") int orderId){
        Order order = orderDAO.getOrder(orderId);
        if(order!=null)
            return order;
        
        return new Order();
    }

    @RequestMapping("/getOrderByDate/{orderDate}")
    public Order getOrderByDate(@PathVariable("orderDate") Date orderDate){
        Order order=orderDAO.getOrderByDate(orderDate);
        if(order!=null)
            return order;
        return new Order();
    }
    
}
