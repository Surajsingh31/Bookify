package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EBook {

    @Id@GeneratedValue
    private int bookId;
    private String eBookName;
    private String genre;
    private double price;
    private String description;
    private String imagePath;
    private String link;

    public EBook() {
        super();
    }

    public EBook(int bookId, String ebookName, String genre, double price, String description, String imagePath,
            String link) {
        this.bookId = bookId;
        this.eBookName = ebookName;
        this.genre = genre;
        this.price = price;
        this.description = description;
        this.imagePath = imagePath;
        this.link = link;
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
     * @return String return the ebookName
     */
    public String getEbookName() {
        return eBookName;
    }

    /**
     * @param ebookName the ebookName to set
     */
    public void setEbookName(String ebookName) {
        this.eBookName = ebookName;
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
     * @return String return the link
     */
    public String getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(String link) {
        this.link = link;
    }

}