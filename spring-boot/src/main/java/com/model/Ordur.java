package com.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Ordur {


@Id@GeneratedValue
    private int ordId;

    private Date orderDate;
    private String address;
    private double amount;
    private String status;

   

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "custId")
    private Customer customer;

     @JsonIgnore
     @ManyToMany
     @JoinTable(name = "order_books",
                joinColumns = @JoinColumn(name = "ordId"),
                inverseJoinColumns = @JoinColumn(name = "bookId"))
     private List<Book> books;
    

    public Ordur(){
        super();
    }

    public Ordur(int ordId, Date orderDate, String address, double amount,String status) {
        this.ordId = ordId;
        this.orderDate = orderDate;
        this.address = address;
        this.amount = amount;
        this.status=status;
    }

    public int getOrderId() {
        return ordId;
    }

    public void setOrderId(int orderId) {
        this.ordId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + ordId + ", orderDate=" + orderDate + ", address=" + address + ", amount=" + amount
                + ", status=" + status + "]";
    }
}