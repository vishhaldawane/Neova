package com.java.Container;

public class MyInteger {
	
	
		 private int x;
		 private int y;
		
		public MyInteger(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}

		 public void swap() {
			System.out.println("swapping....");
			int temp = x;
			x = y;
		    y = temp;
			
		}
		 public void print() {
			System.out.println("X "+x);
		    System.out.println("y "+y);
		}
		
	}


