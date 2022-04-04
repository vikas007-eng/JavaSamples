package com.samples.demos.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {
   public static void main(String[] args) {
	  List<Integer> num = new ArrayList<Integer>();
	  num.add(45);
	  num.add(145);
	  num.add(125);
	  num.add(495);
	  
	  for(int i:num)
		  System.out.println(i);
	  
	  int inputSize = 5;
	  Scanner sc = new Scanner(System.in);
	  List<Integer> list1 = new ArrayList<>();
	  System.out.println("Enter " + inputSize + "element");
	  for(int i=0;i<inputSize;i++) {
		int j = sc.nextInt();
		list1.add(j);
	  }
	  
	  for(int i:list1)
		  System.out.println(i);
	  
	  object[] newobjarray = new
	  
}
}
