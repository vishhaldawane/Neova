package com.java.Container;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class LinkedListTest {
	private static String ourcont;

	public static void main(String[] args) {
	 Contact c11 = new Contact("Rupali","Rupali_205");
	 Contact c12 = new Contact("Rishi","Rishi_296");
	 Contact c13 = new Contact("Rahul","Rahul_258");
	 Contact c14 = new Contact("Ram","Ram_215");
	 Contact c151 = new Contact("Rushabh","Rushabh_558");
	 Contact c161 = new Contact("Nikita","Nikita_20");
	
	 System.out.println("content is ready");
		LinkedList<Contact> cont = new LinkedList <Contact>();
		System.out.println("Container is ready.........");
		 
		
		cont.add(c11);
		cont.add(c12);
		cont.add(c13);
		cont.add(c14);
		cont.add(c151);
		cont.add(c161);
		System.out.println("Contant is added to the container...");
	      
		Iterator<Contact>  logint = cont.iterator();
		while (logint.hasNext()) {
	    Contact ourcont = logint.next();	 

	   	     System.out.println("the contact to :" +ourcont);
	   		
		}	
	     System.out.println("-------------");
	}

	
}
