package com.samples.demos.oop3;

public class Monitor {
   private String model;
   private String manufecturer;
   private int size;
public Monitor(String model, String manufecturer, int size) {
	this.model = model;
	this.manufecturer = manufecturer;
	this.size = size;
}
public void drwPixelAt(int x,int y,String color) {
	 System.out.println("Drawing pixel at " + x + y + "in color "+ color);;
}
   
}
