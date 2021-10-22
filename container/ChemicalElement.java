package com.java.container;

public class ChemicalElement implements Comparable<ChemicalElement>{
	private int atomicNumber;
	private String atomicName;
	private String atomiformula;
	private double atomicWeight;
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomiformula="
				+ atomiformula + ", atomicWeight=" + atomicWeight + "]";
	}
	public ChemicalElement(int atomicNumber, String atomicName, String atomiformula, double atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomiformula = atomiformula;
		this.atomicWeight = atomicWeight;
	}
	
	
	@Override
	public int compareTo(ChemicalElement o) {
	
		System.out.println("comparing ::" + atomiformula+ "with:: "+o.atomiformula);
		return atomiformula.compareTo(o.atomiformula);
	}								
}
