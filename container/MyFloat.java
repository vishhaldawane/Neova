package com.java.container;

public class MyFloat {
	private Float x;//container
	private Float y;
	public MyFloat(Float x, Float y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...hello");
		Float temp = x;
		x=y;
		y=temp;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);
	}

}
