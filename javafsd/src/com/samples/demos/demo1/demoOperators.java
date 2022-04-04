package com.samples.demos.demo1;

public class demoOperators {
	public static void main(String[] args) {

		boolean myflag = false;
		
		if(myflag == false) {
			System.out.println("its false");
		} else {
			System.out.println("trueee");
		}
	
	
	int topScore = 100;
	int secondTopScore = 80;
	
	if((topScore>secondTopScore)||(topScore <= 100)) {
		System.out.println("just missed");
	}

	int age = 34;
	String msg = (age<33)?  "smaller" : "elder";
	System.out.println(msg);
	
	}
}
