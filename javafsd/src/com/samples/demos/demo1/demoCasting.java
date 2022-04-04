package com.samples.demos.demo1;

public class demoCasting {
     public static void main(String[] args) {
		// implicit conversion
    	 System.out.println("implicit Typecating");
    	 char a = '4';
    	 System.out.println("value of a " + a);
    	 
    	 int b = a;
    	 System.out.println(b);
    	 System.out.println("value of b " + b);
    	 
    	 float c = a;
    	 System.out.println("value of c " + c);
    	 
    	 long d = a;
    	 System.out.println("value of d " + d);
    	 
    	 double e = a;
    	 System.out.println("value of e " + e);
    	 
    	 System.out.println("\n");
    	 
    	 // Explicit conversion
    	 
    	 double x = 45.5;
    	 int y = (int)x;
    	 System.out.println("value of x " + x);
    	 System.out.println("value of y " + y); 
	}
}
