package com.sample.demos.oop2;

public class Main {
 public static void main(String[] args) {
	Dog dog = new Dog("jack",12,23,4,5,1);
	dog.eat();
	dog.move(5);
	
	Fish fish = new Fish("chingri",12,122,3,4,33);
	fish.swim(2);
	System.out.println("gills is " + fish.getGills());
	
	Horse horse = new Horse("mike",12,23,"black",true,11);
	System.out.println(horse.isWinner());
	System.out.println(horse.getColor());
}
}
