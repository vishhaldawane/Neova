package com.java.Container;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args)
	{
		ChemicalElement chemicalElement1= new ChemicalElement(99,"Neova","Aluminium",100);
		ChemicalElement chemicalElement2= new ChemicalElement(11,"Neova", "Calcium",100);
	    ChemicalElement chemicalElement3= new ChemicalElement(45,"Neova", "Florin",100);
	    ChemicalElement chemicalElement4= new ChemicalElement(55,"Neova","Phospherous",100);
	    ChemicalElement chemicalElement5= new ChemicalElement(52,"Neova","Clorin",100);
																		
		TreeSet<ChemicalElement> periodicTable  = new TreeSet<ChemicalElement>();
		System.out.println("Container is ready.......");
		periodicTable.add(chemicalElement1);
		periodicTable.add(chemicalElement2);
		periodicTable.add(chemicalElement3);
		periodicTable.add(chemicalElement4);
		periodicTable.add(chemicalElement5);
		 
		Iterator<ChemicalElement> periodicTableList = periodicTable.iterator();
		while(periodicTableList.hasNext())
		{
			System.out.println("Number is:"+periodicTableList.next());
		}
				
	}

}
