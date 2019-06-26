package org.bank.atm;

// import java.text.SimpleDateFormat;

public class Customer {
	private String customerNumber;
	String firstName;
	private String lastName;
	String dateOfbirth;
	
	
	public Customer() {
		
	}
	public Customer (String firstName,String lastName, String customerNumber, String dateOfbirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerNumber = customerNumber;
		this.dateOfbirth = dateOfbirth;
	}
	
	String getFirstName() {
		return firstName;
	}
	void setFirstName(String a) {
		firstName = a;
	}
	String getCustomerNumber() {
		return customerNumber;
	}
	String getLastName() {
		return lastName;
	}
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String toString() {
		return "test";
	}

}
