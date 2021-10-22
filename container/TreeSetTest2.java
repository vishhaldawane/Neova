package com.java.container;

import java.util.Iterator;

import java.util.TreeSet;
public class TreeSetTest2  {
	public static void main(String[] args) {
		ChemicalElement chemicalElement1 = new ChemicalElement(10,"Neon","N" ,20.180);
		ChemicalElement chemicalElement2 = new ChemicalElement(15,"Phospheorous","P" ,30.974);
		ChemicalElement chemicalElement3 = new ChemicalElement(8,"Oxygen","O" ,15.999);
		ChemicalElement chemicalElement4 = new ChemicalElement(20,"calcium","Ca" ,40.087);
		ChemicalElement chemicalElement5 = new ChemicalElement(5,"Boron","B" ,10.81);
		ChemicalElement chemicalElement6 = new ChemicalElement(9,"Fluuoriine","Au" ,18.998);
	
		TreeSet <ChemicalElement> periodicTable= new TreeSet<ChemicalElement>();
	             periodicTable.add(chemicalElement1);
	             periodicTable.add(chemicalElement2);
	             periodicTable.add(chemicalElement3);
	             periodicTable.add(chemicalElement4);
	             periodicTable.add(chemicalElement5);
	             periodicTable.add(chemicalElement6);
	             Iterator<ChemicalElement> P=periodicTable.iterator();
	             while(P.hasNext())
	            	 {
	            	  ChemicalElement element=P.next();
	            	  System.out.println("Element"+element);
	            	 }
	}
}	


	
