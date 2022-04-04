package com.samples.demos.oop7;

public class Parrot extends Bird{

	public Parrot(String name) {
		super(name);
		
	}
	
	public void fly() {
		System.out.println(getName() + " is flying..");
	}

	@Override
	public void breathe() {
		// TODO Auto-generated method stub
		System.out.println(getName() + " is breathing");
		
	}
      
}
