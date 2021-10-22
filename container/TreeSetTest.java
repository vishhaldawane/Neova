package com.java.container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<Integer>myNumberSet= new TreeSet<Integer>();
	System.out.println("container  is ready...");
	System.out.println("adding first element....");
	myNumberSet.add(10);
	System.out.println("adding second element...");
	myNumberSet.add(15);
	myNumberSet.add(8);
	myNumberSet.add(18);
	System.out.println("adding number in container");
	Iterator<Integer> numberIterator =myNumberSet.iterator();
	while(numberIterator.hasNext()) {
		int num = numberIterator.next();
		System.out.println("the element is.." +num);
		
	}
	
	
}
}

