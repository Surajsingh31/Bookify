package com.model;

import java.sql.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int orderId;

    @Column(name = "order_date")
    private Date orderDate;

    @Column(name = "address")
    private String address;

    @Column(name = "amount")
    private double amount;

    @JsonIgnore
    @ManyToMany
    @JoinColumn(name="bookId")
    Book book;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "custId")
    Customer customer;
    

    public Order(){
        super();
    }

    public Order(int orderId, Date orderDate, String address, double amount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.address = address;
        this.amount = amount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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

    public Book getBooks() {
        return book;
    }

    public void setBooks(Book books) {
        this.book = books;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", address=" + address + ", amount=" + amount
                + ", books=" + book + ", customer=" + customer + "]";
    }

}
