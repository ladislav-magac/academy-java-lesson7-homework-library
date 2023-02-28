package com.academy.java.lesson7.homework.library;

public class ForeignBook extends Book {
	
	public ForeignBook(String bookName, String bookAuthor, int pagesNumber) {
		super(bookName, bookAuthor, pagesNumber);
		this.language = "English";
	}
	
	public ForeignBook(String bookName, String bookAuthor, int pagesNumber, String language) {
		super(bookName, bookAuthor, pagesNumber);
		this.language = language;
	}
	
	
	private String language;
	
}
