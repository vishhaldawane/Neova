package com.java.container.LinkedList;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class LinkedListTest3 {
	public static void main(String[] args) {
	
		System.out.println("Creating container...");
		
		PhoneContact   myPhoneContact [] = new PhoneContact[5];
		myPhoneContact[0]= new PhoneContact("Rishi", "rishi@gmail.com", 940540543, "instaRishi", "fbRishi");
		myPhoneContact[1]= new PhoneContact("Ram", "ram@gmail.com", 940540556, "instaRam", "fbRam");
		myPhoneContact[2]= new PhoneContact("Shyam", "Shyam@gmail.com", 941485556, "instaShyam", "fbShyam");
		myPhoneContact[3]= new PhoneContact("Raju", "Raju@gmail.com", 940354856, "instaRaju", "fbRaju");
		myPhoneContact[4]= new PhoneContact("Babu", "Babu@gmail.com", 952140556, "instaBabu", "fbBabu");
		
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneContact.length; i++) {
			System.out.println("Log : "+myPhoneContact[i]);
		}
	}
}
