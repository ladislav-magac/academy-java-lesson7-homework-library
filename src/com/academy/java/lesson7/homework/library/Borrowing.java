package com.academy.java.lesson7.homework.library;

import java.time.LocalDate;

public class Borrowing {

	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowingDate, LocalDate returnDate) {
		this.book = book;
		this.subscriber = subscriber;
		this.borrowingDate = borrowingDate;
		this.returnDate = returnDate;
	}
	
	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowingDate) {
		this.book = book;
		this.subscriber = subscriber;
		this.borrowingDate = borrowingDate;
	}
	
	
	private Book book;
	
	private Subscriber subscriber;
	
	private LocalDate borrowingDate;
	
	private LocalDate returnDate;

	
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public Subscriber getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(Subscriber subscriber) {
		this.subscriber = subscriber;
	}

	public LocalDate getBorrowingDate() {
		return borrowingDate;
	}

	public void setBorrowingDate(LocalDate borrowingDate) {
		this.borrowingDate = borrowingDate;
	}

	public LocalDate getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
}
