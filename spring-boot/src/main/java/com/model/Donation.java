package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Donation {

	
	 @Id@GeneratedValue
	    private int custId;
		private String custName;
		private String email;
		private String publication;
		private String author;
		private String genre;
		private String bookName;
		private int quantity;
		private String phoneNumber;
		private String description;
		
		
		
		
		
		public Donation() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Donation(int custId, String custName, String email, String publication, String author, String genre,
				String bookName, int quantity, String phoneNumber, String description) {
			super();
			this.custId = custId;
			this.custName = custName;
			this.email = email;
			this.publication = publication;
			this.author = author;
			this.genre = genre;
			this.bookName = bookName;
			this.quantity = quantity;
			this.phoneNumber = phoneNumber;
			this.description = description;
		}

		public int getCustId() {
			return custId;
		}

		public void setCustId(int custId) {
			this.custId = custId;
		}

		public String getCustName() {
			return custName;
		}

		public void setCustName(String custName) {
			this.custName = custName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPublication() {
			return publication;
		}

		public void setPublication(String publication) {
			this.publication = publication;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getGenre() {
			return genre;
		}

		public void setGenre(String genre) {
			this.genre = genre;
		}

		public String getBookName() {
			return bookName;
		}

		public void setBookName(String bookName) {
			this.bookName = bookName;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		@Override
		public String toString() {
			return "Donation [custId=" + custId + ", custName=" + custName + ", email=" + email + ", publication="
					+ publication + ", author=" + author + ", genre=" + genre + ", bookName=" + bookName + ", quantity="
					+ quantity + ", phoneNumber=" + phoneNumber + ", description=" + description + "]";
		}
		
		
		
		
}