package com.lakhan.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;



public class LinkedListTest {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Contact c1=new Contact("Lakhan", "lakhan@gmail.com", "the.lucky_777", "Lakhan Shingare", "@shingare_lakhan","9975808107");
		Contact c2=new Contact("Ajinkya", "AjinkyaOm@gmail.com", "ajinkya_01", "Ajinkya Ombase", "@Ajinkya_om","1122334455");
		Contact c3=new Contact("Shubham", "Shubham_salunkhe@gmail.com", "the.shunham", "Shubham salunkhe", "@Shubham_salunkhe","7788996655");
		Contact c4=new Contact("Avinash", "avinash@gmail.com", "the.Avi143", "Avinash Ugale", "@avinash_ugale","5566998877");
		Contact c5=new Contact("Lokesh", "LokeshPAtil@gmail.com", "the.lokeshP", "Lokesh Patil", "@patilLokesh","5588774411");
		System.out.println("Content is ready for likedList");
		
		LinkedList<Contact> myContact=new LinkedList<Contact>();
		System.out.println("Container LinkedList ready....");
		myContact.add(c1);
		myContact.add(c2);
		myContact.add(c3);
		myContact.add(c4);
		myContact.add(c5);
		
	//	Iterator<Contact> contactIterator = myContact.iterator();
		
		System.out.println("------------------------------------");
		for(Contact o:myContact)
		{
			System.out.println("The Contact Details are::"+o);
		}
	
		
		System.out.println("Program Ended");
	}

}
