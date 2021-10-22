package com.java.Container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
	
		
		TreeSet<Integer> myNumberSet = new TreeSet<Integer>();
		System.out.println("container is ready");
		
		System.out.println("adding first element....");
		Object myNumuberSet;
		myNumberSet.add(90);
		System.out.println("adding second element....");
		myNumberSet.add(10);
		
		System.out.println("adding third element....");
		myNumberSet.add(21);
		
		
		System.out.println("adding four element....");
		myNumberSet.add(87);
		
		System.out.println("adding five element....");
		myNumberSet.add(34);
		
		System.out.println("adding six element....");
		myNumberSet.add(45);
		 
		System.out.println("content is added to the container....");
		Iterator<Integer> iterator1=myNumberSet.iterator();
				
		while(iterator1.hasNext()) {
			int num = iterator1.next();
					System.out.println("num is "+num);
		}
		}

	}


