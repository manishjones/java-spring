package com;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer(){
		
	}
	
	public Customer(String name, String namet){
		this.firstName=name;
		this.lastName=namet;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
