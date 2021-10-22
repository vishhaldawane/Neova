package com.java.Container;

public class MyFloat {
	
	private float x;
	 private float y;
	
	public MyFloat(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	 public void swap() {
		System.out.println("swapping....");
		float temp = x;
		x = y;
	    y = temp;
		
	}
	 public void print() {
		System.out.println("X "+x);
	    System.out.println("y "+y);
	}

}
