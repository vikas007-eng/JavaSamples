package com.samples.demos.demo1;

public class demo1 {
 public static void main(String[] args) {
	System.out.println("It is demo 01 class");
	
    String nm = "vikas";
    System.out.println(nm);
    
    String s1 = "hello";
    String s2 = s1 + "world";
    
    System.out.println(s2);
   
    System.out.println(s2.charAt(0));
    
    String s3 = "45";
    int x = Integer.parseInt(s3); // converting string to int
    System.out.println(x);
    
    double num = 123.32;
    String s4 = s1 + num; // concatinate when work with string
    System.out.println(s4);
    
    String s5 = "45x";
    try {
    	x = Integer.parseInt(s5);
    
    } catch (Exception ex) {
    	System.out.println("Failed to read user input " + ex.getMessage());
    	throw ex;
    }
    
    System.out.println(x);
}
}
