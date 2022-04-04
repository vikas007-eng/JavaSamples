package com.samples.demos.Hashmapdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class testLinkedHashMap {
  public static void main(String[] args) {
	Map<String,String> mymap = new LinkedHashMap<String,String>();
	mymap.put("B", "b");
	mymap.put("A", "a");
	mymap.put("C", "c");
//	System.out.println(mymap);
	
	mymap.get("c");
	System.out.println(mymap + "\n ------------------");
	
	Map<String,String> mymap2= new LinkedHashMap<String,String>();
	mymap2.put("B", "b");
	mymap2.put("A", "a");
	mymap2.put("C", "c");
	System.out.println(mymap2);
	
	mymap2.get("A");
	System.out.println(mymap2);
	mymap2.get("B");
	System.out.println(mymap2);
	mymap2.put("A", "a");
	
	
	
}
}
