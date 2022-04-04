package com.sample.demos.oop2;

public class Fish extends Animal{
   private int gills;
   private  int fins;
   private int eyes;
   
public Fish(String name, int size, int weight, int gills, int fins, int eyes) {
	super(name, size, weight);
	this.gills = gills;
	this.fins = fins;
	this.eyes = eyes;
}
    
    public void swim(int speed) {
    	super.speed(speed);
    	System.out.println("swim() called.." + speed);
    }

	public int getGills() {
		return gills;
	}

	public int getFins() {
		return fins;
	}

	public int getEyes() {
		return eyes;
	}
    
    
}
