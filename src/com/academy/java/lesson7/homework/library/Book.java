package com.academy.java.lesson7.homework.library;

public class Book {
	
	public Book(String bookName, String bookAuthor, int pagesNumber) {
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.pagesNumber = pagesNumber;
	}

	
	private String bookName;
	
	private String bookAuthor;
	
	private int pagesNumber;
	

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getPagesNumber() {
		return pagesNumber;
	}

	public void setPagesNumber(int pagesNumber) {
		this.pagesNumber = pagesNumber;
	}
	
}
