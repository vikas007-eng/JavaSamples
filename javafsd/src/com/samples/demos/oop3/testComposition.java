package com.samples.demos.oop3;

public class testComposition {
    public static void main(String[] args) {
		BoxCase boxCase = new BoxCase("220B","Dell","233");
		Monitor monitor = new Monitor("27 iince","Acer",23);
		Motherboard motherBoard = new Motherboard("Bj-200","asus",4,6,"v2.22");
		PC pc = new PC(boxCase,monitor,motherBoard);
		pc.powerUp();
	}
}
