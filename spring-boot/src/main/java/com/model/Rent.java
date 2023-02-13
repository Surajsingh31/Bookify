
// package com.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.JoinColumn;
// import javax.persistence.Id;


// @Entity
// public class Rent {

//     @Id@GeneratedValue
//     private int id;
//     private String loanDate;
//     private String returnDate;
//     private double amount;

//     @JoinColumn(name="bookId")
//     Book book;
//     @JoinColumn(name="customerId")
//     Customer customer;

    
//     public Rent() {
//         super();
//     }

//     public Rent(int id, String loanDate, String returnDate, double amount) {
//         this.id = id;
//         this.loanDate = loanDate;
//         this.returnDate = returnDate;
//         this.amount = amount;
//     }

//     public Rent(int id, String loanDate, String returnDate, double amount, Book book, Customer customer) {
//         this.id = id;
//         this.loanDate = loanDate;
//         this.returnDate = returnDate;
//         this.amount = amount;
//         this.book = book;
//         this.customer = customer;
//     }

//     public int getId() {
//         return id;
//     }

//     public void setId(int id) {
//         this.id = id;
//     }

//     public String getLoanDate() {
//         return loanDate;
//     }

//     public void setLoanDate(String loanDate) {
//         this.loanDate = loanDate;
//     }

//     public String getReturnDate() {
//         return returnDate;
//     }

//     public void setReturnDate(String returnDate) {
//         this.returnDate = returnDate;
//     }

//     public double getAmount() {
//         return amount;
//     }

//     public void setAmount(double amount) {
//         this.amount = amount;
//     }

//     @Override
//     public String toString() {
//         return "Rent [id=" + id + ", loanDate=" + loanDate + ", returnDate=" + returnDate + ", amount=" + amount + "]";
//     }

    

    


    
// }
