package com.samples.demos.arrays;

public class testArrays {
   public static void main(String[] args) {
	  
	   int[] myArray = new int[10];
	   myArray[4] = 10;

	 
	   for(int i=0;i<10;i++) {
		   System.out.println(myArray[i]);
	   }
	   
	   int[] arr2 = {1,4,3,5,4,6,8,9}; // array literals
	   System.out.println(arr2.length);
}
}
