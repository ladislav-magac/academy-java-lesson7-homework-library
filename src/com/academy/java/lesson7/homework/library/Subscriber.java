package com.academy.java.lesson7.homework.library;

public class Subscriber {

	public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress = fullAddress;
		this.emailAddress = emailAddress;
		this.age = age;
	}
	
	public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.subscriberAddress = fullAddress;
		this.emailAddress = emailAddress;
	}
	
	
	private String firstName;
	
	private String lastName;
	
	private SubscriberAddress subscriberAddress;
	
	private String emailAddress;
	
	private int age;

	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public SubscriberAddress getSubscriberAddress() {
		return subscriberAddress;
	}

	public void setSubscriberAddress(SubscriberAddress subscriberAddress) {
		this.subscriberAddress = subscriberAddress;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
