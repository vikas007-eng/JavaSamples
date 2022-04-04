package com.sample.demos.oop2;

public class byValbyRef {
   public static void main(String[] args) {
	
	   House house = new House("blue");
	   House anotherHouse = house;
	   
	   System.out.println("house color : " + house.getColor());
	   System.out.println("another house color : "+anotherHouse.getColor());
	   anotherHouse.setColor("pink");
	   System.out.println("another house color : "+anotherHouse.getColor());
	   System.out.println("house color : " +house.getColor());
	   
}
}
