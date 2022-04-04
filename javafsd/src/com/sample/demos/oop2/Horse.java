package com.sample.demos.oop2;

public class Horse extends Animal {
     private String color;
     private boolean winner;
     private int age;
     private int speed;
	
     public Horse(String name, int size, int weight, String color, boolean winner, int age) {
		super(name, size, weight);
		this.color = color;
		this.winner = winner;
		this.age = age;
	}
     
     public void speed(int speed) {
    	 super.speed(speed);
    	 System.out.println("horse is running at the speed of " + speed);
     }
     
     public void IsWinner() {
    	 System.out.println("IsWinner : " + winner);
     }

	public String getColor() {
		return color;
	}

	public boolean isWinner() {
		return winner;
	}

	public int getAge() {
		return age;
	}

	public int getSpeed() {
		return speed;
	}
     
     
     
}
