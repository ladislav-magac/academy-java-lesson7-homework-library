package com.academy.java.lesson7.homework.library;

public class Subscriber {
	
	public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress = fullAddress;
		this.emailAddress = emailAddress;
	}
	
	public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress, int age) {
		this(firstName, lastName, fullAddress, emailAddress);
		this.age = age;
	}
	
	
	private String firstName;
	
	private String lastName;
	
	private SubscriberAddress subscriberAddress;
	
	private String emailAddress;
	
	private int age;
	
}
