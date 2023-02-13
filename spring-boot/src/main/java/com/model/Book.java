package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {

    @Id@GeneratedValue
    private int bookId;

    private String bookName;
    private double price;
    private String genre;
    private String type;
    private String description;
    private String imagePath;
    private int quantity;
    private String authors;
    private String publications;

    @JsonIgnore
    @ManyToMany(mappedBy = "order")
    List<Order> order = new ArrayList<Order>();

    // @JsonIgnore
    // @ManyToMany(mappedBy = "book")
    // List<Customer> cust = new ArrayList<Customer>();


    public Book() {
        super();
    }

    public Book(int bookId, String bookName, double price, String genre, String type, String description,
            String imagePath, int quantity, String authors, String publications) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
        this.genre = genre;
        this.type = type;
        this.description = description;
        this.imagePath = imagePath;
        this.quantity = quantity;
        this.authors = authors;
        this.publications = publications;
    }


    /**
     * @return int return the bookId
     */
    public int getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    /**
     * @return String return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return double return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return String return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return String return the imagePath
     */
    public String getImagePath() {
        return imagePath;
    }

    /**
     * @param imagePath the imagePath to set
     */
    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    /**
     * @return int return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return String return the authors
     */
    public String getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String authors) {
        this.authors = authors;
    }

    /**
     * @return String return the publications
     */
    public String getPublications() {
        return publications;
    }

    /**
     * @param publications the publications to set
     */
    public void setPublications(String publications) {
        this.publications = publications;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", genre=" + genre + ", type="
                + type + ", description=" + description + ", imagePath=" + imagePath + ", quantity=" + quantity
                + ", authors=" + authors + ", publications=" + publications + "]";
    }

    

}