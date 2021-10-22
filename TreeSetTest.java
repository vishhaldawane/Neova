package com.java.Container1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		
		TreeSet<Integer> myNumberSet=new TreeSet<Integer>();
		System.out.println("container is ready");
		System.out.println("adding first element....");
		myNumberSet.add(10);
		System.out.println("adding second number....");
		myNumberSet.add(15);
		myNumberSet.add(8);
		myNumberSet.add(5);
		myNumberSet.add(9);
		myNumberSet.add(13);
		System.out.println("added all this element...");
		System.out.println("content added container...");
		Iterator<Integer> numberIterator=myNumberSet.descendingIterator();
		while(numberIterator.hasNext()) {
			int num=numberIterator.next();
			System.out.println("num is"+num);
		}
	}

}
