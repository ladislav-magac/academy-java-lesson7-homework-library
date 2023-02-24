package com.academy.java.lesson7.homework.library;

public class ForeignBook extends Book {

	public ForeignBook(String bookName, String bookAuthor, int pagesNumber, String language) {
		super(bookName, bookAuthor, pagesNumber);
		this.language = language;
	}
	
	public ForeignBook(String bookName, String bookAuthor, int pagesNumber) {
		super(bookName, bookAuthor, pagesNumber);
		this.language = "English";
	}
	
	
	private String language;

	
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
}
