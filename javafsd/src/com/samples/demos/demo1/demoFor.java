package com.samples.demos.demo1;

public class demoFor {
      public static void main(String[] args) {
		// find  all prime numbr betw 10 and 40 
    	 // total number of prime umber
    	  int Totalprime = 0;
    	  
    	 for(int i=10;i<=40;i++) {
    		 int count = 0;
    		 for(int j = 2 ; j <= i/2 ; j++ ) {
    			 if(i%j==0) {
    				 count++;
    			 }
    			 if(count==0) {
    				 System.out.println(i);
    				 Totalprime++;
    				 break;
    			 }
    		 }
    	 }
    	 System.out.println("total number of prime number is : " + Totalprime);
	}
      
  
}
