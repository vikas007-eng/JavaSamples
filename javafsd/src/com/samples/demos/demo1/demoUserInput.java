package com.samples.demos.demo1;

import java.util.Scanner;

public class demoUserInput {
  public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the Number");
	  int num = sc.nextInt();
	  System.out.println("number is " + num);
	  sc.close();
}
}
