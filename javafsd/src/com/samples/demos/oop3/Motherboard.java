package com.samples.demos.oop3;

public class Motherboard {
     private String model;
     private String manufectrurer;
     private int ramSlots;
     private int cardSlots;
     private String bios;
	public Motherboard(String model, String manufectrurer, int ramSlots, int cardSlots, String bios) {
		super();
		this.model = model;
		this.manufectrurer = manufectrurer;
		this.ramSlots = ramSlots;
		this.cardSlots = cardSlots;
		this.bios = bios;
	}
     
	public void loadProgram(String programName) {
		System.out.println("program " + programName + "is Loading");
	}
}
