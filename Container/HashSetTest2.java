package com.java.Container;

import java.util.HashSet;

public class HashSetTest2 {
	public static void main(String[] args) {
		Book bookObj1= new Book(100,"mechanical","Rahul",700,350,6);
		System.out.println("bookObj1 "+bookObj1.hashCode());
		
		Book bookObj2= new Book(101,"Signal And System","Alan V Oppenheim",900,250,4);
		System.out.println(" bookObj2 "+ bookObj2.hashCode());
		
		
		Book bookObj3= new Book(102,"Micro","ravi verma",650,180,2);
		System.out.println("bookObj3 "+bookObj3.hashCode());
		
		Book bookObj4 = bookObj1;
		Book bookObj5 = bookObj2;
		Book bookObj6 = bookObj3; 
		
		System.out.println("bookObj4"+ bookObj4.hashCode());
		System.out.println("bookObj5"+ bookObj5.hashCode());
		System.out.println("bookObj6"+ bookObj6.hashCode());
		
		HashSet<Book> bookshelf = new HashSet<Book>();
		bookshelf.add(bookObj1);
		
		bookshelf.add(bookObj2);
		bookshelf.add(bookObj3);
		bookshelf.add(bookObj4);
		bookshelf.add(bookObj5);
		bookshelf.add(bookObj6);
		for(Book  TheBook  :  bookshelf)
		{
			System.out.println("The book is: "+TheBook);
		}
	}

}
