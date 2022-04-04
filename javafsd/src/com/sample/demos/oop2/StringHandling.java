package com.sample.demos.oop2;

public class StringHandling {
   public static void main(String[] args) {
	String s1 = new String("Hello World");
	System.out.println(s1.length());
	
	String sub = new String("Welcome");
	System.out.println(sub.substring(1));
	
	String s2 = "world";
	String s3 = "world";
	System.out.println(s2.compareTo(s3));
	// 0 = both are same
	// <0 = s2<s3
	//>0 = s2>s3
	
	String s4 = "dd";
	System.out.println(s4.isEmpty());
	
	StringBuffer sb = new StringBuffer("hello world");
	System.out.println(sb.toString());
	sb.append(" to ");
	sb.append(" eveyone ");
	sb.replace(6, 11, "java"); // position 6 to 11 replace by java
	System.out.println(sb);
	
	
}
}
