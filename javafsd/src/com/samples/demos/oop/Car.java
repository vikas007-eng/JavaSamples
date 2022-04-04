package com.samples.demos.oop;

public class Car {
  
	private String fuelType;
	int nuOfWheel;
	String gearType;
	String colour;
	  public String getFuelType() {
		  return fuelType;
	  }
	  public void setFuelType(String type) {
		  fuelType = type;
	  }
	public int getNuOfWheel() {
		return nuOfWheel;
	}
	public void setNuOfWheel(int nuOfWheel) {
		this.nuOfWheel = nuOfWheel;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
}
