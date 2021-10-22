package com.java.Container1;

public class ChemicalElement implements Comparable<ChemicalElement>  {

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

public int compareTo(ChemicalElement o)
{
System.out.println("Comparing "+atomicFormula+"with"+o.atomicFormula);

return atomicFormula.compareTo(o.atomicFormula);
}
@Override
public String toString() {
return "ChemicalElements [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
}



}




