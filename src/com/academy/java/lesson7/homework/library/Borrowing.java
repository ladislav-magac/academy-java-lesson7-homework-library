package com.academy.java.lesson7.homework.library;

import java.time.LocalDate;

public class Borrowing {
	
	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowingDate) {
		this.book = book;
		this.subscriber = subscriber;
		this.borrowingDate = borrowingDate;
	}
	
	public Borrowing(Book book, Subscriber subscriber, LocalDate borrowingDate, LocalDate returnDate) {
		this(book, subscriber, borrowingDate);
		this.returnDate = returnDate;
	}
	
	
	private Book book;
	
	private Subscriber subscriber;
	
	private LocalDate borrowingDate;
	
	private LocalDate returnDate;
	

	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	
}
