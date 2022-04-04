package com.samples.demos.oop;

public class Account {
   private String number;
   private double balance;
   private String customerName;
   private String customerEmail;
   private String phoneNumber;
   

	public Account(String number ,double balance, String customerName, String customerEmail, String i) {
		super();
		this.number = number;
		this.balance = balance;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.phoneNumber = i;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public String getNumber() {
		return number;
	}


	public String getCustomerName() {
		return customerName;
	}


	public String getCustomerEmail() {
		return customerEmail;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}
}
