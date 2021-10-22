package com.java.container;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListTest { 
	public static void main(String[] args) {

	   Contact c1=new Contact(123, "rj", "sury@", "xyz");
	   Contact c2=new Contact(143, "Sk", "sg@", "yz");
	   Contact c3=new Contact(163, "Sb", "sgs@", "yy");   
	   Contact c4=new Contact(133, "aj", "fgsd@", "zz");
	   Contact c5=new Contact(173, "Srk", "dfgs@", "zy");
			   
			   
			   
		System.out.println("Content is ready....");
		
		LinkedList<Contact>   cont1 = new LinkedList<Contact>();
		System.out.println("Container is ready....");
		
		cont1.add(c1);
		cont1.add(c2); //quantum computer
		cont1.add(c3); 
		cont1.add(c4); 
		cont1.add(c5); 
		System.out.println("Content is added to the container..");
		
		
		Iterator<Contact> logint = cont1.iterator();
		
		while(logint.hasNext()) {
			Contact ourcont = logint.next();
			System.out.println("the contact to : "+ourcont);
		}
		System.out.println("-----------------");
		
		
	}
}


