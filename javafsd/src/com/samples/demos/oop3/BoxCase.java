package com.samples.demos.oop3;

public class BoxCase {
     
	private String model;
	private String manufecturer;
	private String powerSupply;
	public BoxCase(String model, String manufecturer, String powerSupply) {
		this.model = model;
		this.manufecturer = manufecturer;
		this.powerSupply = powerSupply;
	}
	
	public void pressPowerButton() {
		System.out.println("power button pressed..");
	}
	
	
}
