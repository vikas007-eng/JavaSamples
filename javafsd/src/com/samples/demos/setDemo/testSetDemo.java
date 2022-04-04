package com.samples.demos.setDemo;

import java.util.HashSet;
import java.util.Set;

public class testSetDemo {
  public static void main(String[] args) {
	 Set<String> set1 = new HashSet<>();
	 set1.add("a");
	 set1.add("b");
	 set1.add("a");	 
//	 System.out.println(set1);
	 
	 Set<Book> books = new HashSet<Book>();
	 Book book1 = new Book("vikas the unstappable" , "vikas" , 1232);
	 Book book2 = new Book("vikas the unstappable" , "vi" , 122);
	 
	 books.add(book1);
	 books.add(book2);
	 
	 System.out.println(books);
}
}

class Book{
	private String title;
	private String author;
	private int year;
	public Book(String title, String author, int year) {
	
		this.title = title;
		this.author = author;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", year=" + year + "]";
	}
	
	
	
	
}