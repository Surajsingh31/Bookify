package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import java.sql.Date;

@Entity
public class Order {

    @Id@GeneratedValue
    private int orderId;

    @Column(name="orderName",length=30)
    private String orderName;

    private double amount;
    private Date date;
    private String address;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name="bookId")
    Book book;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name="CustId")
    Customer cust;

    public Order(){

    }

    public Order(int orderId, String orderName, double amount, Date date, String address) {
        this.orderId = orderId;
        this.orderName = orderName;
        this.amount = amount;
        this.date = date;
        this.address = address;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderName=" + orderName + ", amount=" + amount + ", date=" + date
                + ", address=" + address + ", book=" + book + ", cust=" + cust + "]";
    }

    public Order orElse(Object object) {
        return null;
    }

}
