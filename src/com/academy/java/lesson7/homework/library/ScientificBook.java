package com.academy.java.lesson7.homework.library;

public class ScientificBook extends Book {

	ScientificBook(String bookName, String bookAuthor, int pagesNumber, String scientificArea) {
		super(bookName, bookAuthor, pagesNumber);
		this.scientificArea = scientificArea;
	}
	
	
	private String scientificArea;

	
	public String getScientificArea() {
		return scientificArea;
	}

	public void setScientificArea(String scientificArea) {
		this.scientificArea = scientificArea;
	}
	
}
