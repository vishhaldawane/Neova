package com.java.Container1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		ChemicalElement ch1=new ChemicalElement(10,"Neon","Ne",20.180);
		ChemicalElement ch2=new ChemicalElement(15,"Phosphorus","p",30.974);
		ChemicalElement ch3=new ChemicalElement(8,"Oxygen","o",15.999);
		ChemicalElement ch4=new ChemicalElement(20,"Calcium","ca",40.078);
		ChemicalElement ch5=new ChemicalElement(5,"Boran","B",10.81);
		ChemicalElement ch6=new ChemicalElement(9,"Florin","f",18.998);
		ChemicalElement ch7=new ChemicalElement(13,"Aluminium","Au",26.98154);
		TreeSet<ChemicalElement> periodicTable=new TreeSet<ChemicalElement>();
		System.out.println("container is ready");
		System.out.println("Adding 1 Element "+periodicTable.add(ch1));
		System.out.println("Adding 2 Element "+periodicTable.add(ch2));
		System.out.println("Adding 3 Element "+periodicTable.add(ch3));
		System.out.println("Adding 4 Element "+periodicTable.add(ch4));
		System.out.println("Adding 5 Element "+periodicTable.add(ch5));
		System.out.println("Adding 6 Element "+periodicTable.add(ch6));
		Iterator<ChemicalElement> numberIterator=periodicTable.descendingIterator();
		while(numberIterator.hasNext()) {
			ChemicalElement theElement=numberIterator.next();
			System.out.println("num is"+theElement);
		}
		}
	}	
	

