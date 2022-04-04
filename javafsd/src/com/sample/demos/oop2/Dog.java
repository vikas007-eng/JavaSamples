package com.sample.demos.oop2;

public class Dog extends Animal{
	
	private int eyes;
	private int legs;
	private int tail;


	public Dog(String name, int size, int weight, int eyes, int legs, int tail) {
		super(name, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
	}
	 
	private void moveLeg(int speed) {
		System.out.println("movibg leg in " + speed);
	}
	
	 public void move(int speed) {
		 System.out.println("move called()..");
		 moveLeg(speed);
		 super.speed(speed);
	 }
    
	
}
