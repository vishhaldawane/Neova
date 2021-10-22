package com.java.container;

public class MyValue {
	private AnyType x;
	private AnyType y;
	public MyValue(AnyType x, AnyType y) {
		super();
		this.x = x;
		this.y = y;
	}

	
	void swap() {//algorithm
		System.out.println("swaping...hello");
		AnyType temp = x;
		x=y;
		y=temp;
}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);
	}
}
            