package com.java.container.LinkedList;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Iterator;

public class LinkedListTest1 {
	public static void main(String[] args) {
		
		PhoneContact contact1 = new PhoneContact("Rishi", "rishi@gmail.com", 940540543, "instaRishi", "fbRishi");
		PhoneContact contact2 = new PhoneContact("Ram", "ram@gmail.com", 940540556, "instaRam", "fbRam");
		PhoneContact contact3 = new PhoneContact("Shyam", "Shyam@gmail.com", 941485556, "instaShyam", "fbShyam");
		PhoneContact contact4 = new PhoneContact("Raju", "Raju@gmail.com", 940354856, "instaRaju", "fbRaju");
		PhoneContact contact5 = new PhoneContact("Babu", "Babu@gmail.com", 952140556, "instaBabu", "fbBabu");
		
		PhoneContact   myPhoneContact [] = new PhoneContact[5];
		myPhoneContact[0] = contact1;
		myPhoneContact[1] = contact2;
		myPhoneContact[2] = contact3;
		//myPhoneContact[3] = contact4;
		//myPhoneContact[4] = contact5;
		
		System.out.println("Iterating thru the array...");
		for (int i = 0; i < myPhoneContact.length; i++) {
			System.out.println("Log : "+myPhoneContact[i]);
		}
	}
}
