package com.java.Container;



public class Tester1 {
public static void main(String[] args) {
	MyValue<Integer> mi = new MyValue<Integer>(40,20);
	   mi.print();     
	   mi.swap();
	   mi.print();
	   
	   System.out.println("-------");
	   MyValue<Float> mf = new MyValue<Float>(10.2f,20.1f);
	   mf.print();
	   mf.swap();
	   mf.print();
	   
	   System.out.println("------");
	   MyValue<String> ms = new MyValue<String>("core","java");
	   ms.print();
	   ms.swap();
	   ms.print();
	     
	   
	
}
}
