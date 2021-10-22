package com.java.Container;

public class MyValue<AnyType> {
 private AnyType x;
 private AnyType y;
public MyValue(AnyType x, AnyType y) {
	super();
	this.x = x;
	this.y = y;
}
 public void swap() {
	 System.out.println("swapping....");
	 AnyType temp = x;
 }
 public void print() {
	 System.out.println("x "+x);
	 System.out.println("y "+y);
 }
}
