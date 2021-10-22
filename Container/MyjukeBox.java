package com.java.Container;

public class MyjukeBox {
	private song x;
	private song y;
	public MyjukeBox(song x, song y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void swap() {
		System.out.println("swapping....song");
		song temp = x;
		x = y ;
		y = temp ;
	
	}
public void print() {
	System.out.println("x "+x);
	System.out.println("y "+y);
}
}
