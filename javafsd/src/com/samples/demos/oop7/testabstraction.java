package com.samples.demos.oop7;

public class testabstraction {
  public static void main(String[] args) {
	Animal animal = new Dog("kutta");
	animal.eat();
	animal.breathe();
	
	Bird parrot = new Parrot("tota");
	parrot.eat();
	parrot.breathe();
}
}
