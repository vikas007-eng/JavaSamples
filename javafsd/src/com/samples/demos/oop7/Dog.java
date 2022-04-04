package com.samples.demos.oop7;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
    
	@Override
	public void eat() {
		System.out.println(getName() + "is eating");
	}
	
	@Override
	public void breathe() {
		System.out.println(getName() + "is breathing");
}

}