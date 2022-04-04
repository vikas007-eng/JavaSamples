package com.sample.demos.oop2;

public class Animal {
    private String name;
     private int size;
    private int weight;
    
    
	public Animal(String name, int size, int weight) {
		super();
		this.name = name;
		this.size = size;
		this.weight = weight;
	}
 
	 public void eat() {
		 System.out.println("Animal is eating..");
	 }
	 
	 public void speed(int speed) {
		 System.out.println("animal is running.." + speed);
	 }
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
    
}
