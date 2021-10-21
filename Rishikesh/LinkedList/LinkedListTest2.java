package com.java.container.LinkedList;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class LinkedListTest2 {
	public static void main(String[] args) {
		
		
		System.out.println("Content is ready....");
		
		System.out.println("Creating container...");
		
		PhoneContact   myPhoneContact [] = {
				new PhoneContact("Rishi", "rishi@gmail.com", 940540543, "instaRishi", "fbRishi"),
				new PhoneContact("Ram", "ram@gmail.com", 940540556, "instaRam", "fbRam"),
				new PhoneContact("Shyam", "Shyam@gmail.com", 941485556, "instaShyam", "fbShyam"),
				new PhoneContact("Raju", "Raju@gmail.com", 940354856, "instaRaju", "fbRaju"),
				new PhoneContact("Babu", "Babu@gmail.com", 952140556, "instaBabu", "fbBabu"),
		};
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneContact.length; i++) {
			System.out.println("Log : "+myPhoneContact[i]);
		}
	}
}
