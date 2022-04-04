package com.samples.demos.arrays;

import java.util.Scanner;

public class ArrayProgram {
	
	 static Scanner sc = new Scanner(System.in);
	 
 public static void main(String[] args) {
	
	 int[] arr = getIntegers(5);
	 for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
     }
	 
	 System.out.println(getAverage(arr));
	 System.out.println(getMinValue(arr));
}

private static int getMinValue(int[] arr) {
	  int min = arr[0];
	  for(int i = 1; i<arr.length;i++) {
		  if(arr[i]<min) {
			  min = arr[i];
		  }
	  }
	  return min;
}

private static int getAverage(int[] arr) {
      int sum = 0;
      for(int i=0;i<arr.length;i++) {
    	  sum+=arr[i];	  
      }
      
      return sum/arr.length;
     
}

private static int[] getIntegers(int number) {
     System.out.println("Enter " + number + "Integer values. \r");
     int[] value = new int[number];
     for(int i=0;i<value.length;i++) {
    	 value[i] = sc.nextInt();
     }
     return value;
}
}
