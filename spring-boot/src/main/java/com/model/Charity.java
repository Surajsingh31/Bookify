package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Charity {

    @Id@GeneratedValue
    private int charityId;
    
    private String name;
    private String parentName;
    private String address;
    private double income;
    private String bookName;

   

    public Charity(){
        super();
    }

    public Charity(int charityId, String name, String parentName, String address, double income,String bookName) {
        this.charityId = charityId;
        this.name = name;
        this.parentName = parentName;
        this.address = address;
        this.income = income;
        this.bookName=bookName;
        //this.book = book;
    }

    public int getCharityId() {
        return charityId;
    }

    public void setCharityId(int charityId) {
        this.charityId = charityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getBook() {
        return bookName;
    }

    public void setBook(String book) {
        this.bookName = book;
    }
    
    @Override
    public String toString() {
        return "Charity [charityId=" + charityId + ", name=" + name + ", parentName=" + parentName + ", address="
                + address + ", income=" + income + "]";
    }

}