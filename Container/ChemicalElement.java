package com.java.Container;

import java.util.Iterator;

public class ChemicalElement  implements Comparable<ChemicalElement>{
	

	private int atomicNumber;
	private String atomicName;
	private String atomicFormula;
	private double atomicWeight;

	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}

	@Override
	public int compareTo(ChemicalElement O) {
		System.out.println("comparing "+" atomicFormula"+ "with"+" "+atomicFormula);
		return atomicFormula.compareTo(atomicFormula);
	}
}
 


	