package com.java.container;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
	Contact l=new Contact(123, "ram", "ram@g", "ram98");
	Contact l2=new Contact(123, "ram", "ram@g", "ram98");
	LinkedList<Contact> b=new LinkedList<Contact>();
	b.add(l);
	b.add(l2);
	
	for (Contact g:b)
	{
		System.out.println("g"+g);
	}
	
}
	
}