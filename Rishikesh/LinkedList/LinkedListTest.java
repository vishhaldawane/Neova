package com.java.container.LinkedList;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import com.java.container.PhoneLog;

public class LinkedListTest {
	public static void main(String[] args) {

		PhoneContact contact1 = new PhoneContact("Rishi", "rishi@gmail.com", 940540543, "instaRishi", "fbRishi");
		PhoneContact contact2 = new PhoneContact("Ram", "ram@gmail.com", 940540556, "instaRam", "fbRam");
		PhoneContact contact3 = new PhoneContact("Shyam", "Shyam@gmail.com", 941485556, "instaShyam", "fbShyam");
		PhoneContact contact4 = new PhoneContact("Raju", "Raju@gmail.com", 940354856, "instaRaju", "fbRaju");
		PhoneContact contact5 = new PhoneContact("Babu", "Babu@gmail.com", 952140556, "instaBabu", "fbBabu");
		
		System.out.println("Content is ready....");
				
		LinkedList<PhoneContact> myPhoneContact = new LinkedList<PhoneContact>();
		System.out.println("Container is ready.....");

		myPhoneContact.add(contact1);
		myPhoneContact.add(contact2);
		myPhoneContact.add(contact3);
		myPhoneContact.add(contact4);
		myPhoneContact.add(contact5);

		System.out.println(myPhoneContact);
		System.out.println("Content is added to the container.... ");


	}
}