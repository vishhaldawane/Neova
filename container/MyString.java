package com.java.container;

public class MyString {
	private String x;//container
	private String y;
	public MyString(String x, String y) {
		super();
		this.x = x;
		this.y = y;
	}
	void swap() {//algorithm
		System.out.println("swaping...");
		String temp = x;
		x=y;
		temp=y;
	}
	void print() {//iterator
		System.out.println("x "+x);
		System.out.println("y "+y);

}
}
