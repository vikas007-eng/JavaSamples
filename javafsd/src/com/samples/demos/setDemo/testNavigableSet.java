package com.samples.demos.setDemo;

import java.util.NavigableSet;
import java.util.TreeSet;

public class testNavigableSet {
    public static void main(String[] args) {
		
    	NavigableSet<Integer> setofints = new TreeSet<Integer>();
    	setofints.add(44);
    	setofints.add(334);
    	setofints.add(12);
    	setofints.add(23);
    	
    	System.out.println(setofints);
    	
    	System.out.println("What is the element , lower of 44 : " + setofints.lower(44));
    	System.out.println("What is the element , lower of 44 : " + setofints.higher(44));
    	System.out.println("What is the element , lower of 44 : " + setofints.ceiling(44));
    	System.out.println("What is the element , lower of 44 : " + setofints.floor(44));
    	System.out.println("-------------------------");
    	
    	System.out.println("last element : " + setofints.last());
    	System.out.println("original set : " + setofints );
    	System.out.println("Descending order set : " + setofints.descendingSet());
    	
    	NavigableSet<Integer> headSet = setofints.headSet(23,true);
    	System.out.println("HeadSet : " + headSet);
    	headSet.add(6);
    	System.out.println("headSet : " + headSet);
    	System.out.println("Original Set : " + setofints);
    	
	}
}
