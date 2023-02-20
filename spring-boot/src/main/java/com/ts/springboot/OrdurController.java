package com.ts.springboot;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;
import com.dao.OrdurDAO;
import com.model.Ordur;


@RestController
public class OrdurController {

    @Autowired
    OrdurDAO orderDAO;

    @RequestMapping("/showAllOrders")
    public List<Ordur> showAllOrders(){
        List<Ordur> orderList=orderDAO.findAllOrders();
        return orderList;
    }

    @GetMapping("/getOrderById/{orderId}")
    public Ordur getOrderById(@PathVariable("orderId") int orderId){
        Ordur order = orderDAO.findOrderByOrderId(orderId);
        if(order!=null)
            return order;

        return new Ordur();
    }


    @RequestMapping("/getOrderByDate/{orderDate}")
    public List<Ordur> getOrderByDate(@PathVariable("orderDate") Date orderDate){
        List<Ordur> order=orderDAO.findOrdersByOrderDate(orderDate);
        if(order!=null)
            return order;
            
        return null;
    }

    @RequestMapping("/getOrderByCustId/{custId}")
    public List<Ordur> getOrderByCustId(@PathVariable("custId") int custId){
         List<Ordur> order = orderDAO.findOrderByCustId(custId);
         return order;
    }
    
}
