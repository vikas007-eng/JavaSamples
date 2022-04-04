package com.samples.dmos.oop6;

public class testInterface {
   public static void main(String[] args) {
	 ITelephone tele = new MobilePhone();
	 tele.powerOn();
	 
	 ITelephone tele2 = new DeskPhone();
	 tele2.dial();
	 tele2.powerOn();
}
}
