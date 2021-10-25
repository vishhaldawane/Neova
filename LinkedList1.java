

package com.java.container;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
// package com.java.container;

// import java.time.LocalDateTime;
// import java.util.ArrayList;
// import java.util.Iterator;
//
// public class ArrayListTest {
public static void main(String[] args) {

Contact log1 = new Contact("Shubham","6363636363", "asd@gmail.com" ,"Salunkhe"  );
Contact log2 = new Contact("Shripad","3232323232",  "asd@gmail.com" ,"Yachwad" );
Contact log3 = new Contact("Balram","10101010101","asd@gmail.com" ,"Kale"   );
Contact log4 = new Contact("Kedar","2020202020",  "asd@gmail.com" ,"Gaikwad" );
Contact log5 = new Contact("Pravin","8787878787", "asd@gmail.com" ,"Thombre" );
System.out.println("Content is ready....");

// ArrayList<PhoneLog>   myContactList = new ArrayList<PhoneLog>();
LinkedList<Contact> myContactList = new LinkedList<Contact>();
System.out.println("Container is ready....");

myContactList.add(log1);
myContactList.add(log2); //quantum computer
myContactList.add(log3);
myContactList.add(log4);
myContactList.add(log5);
System.out.println("Content is added to the container..");


Iterator<Contact> logIterator = myContactList.iterator();

while(logIterator.hasNext()) {
Contact theLog = logIterator.next();
System.out.println("the Log : "+theLog);
}
System.out.println("-----------------");
for (Contact contact : myContactList) {
System.out.println("the Log : "+contact);
}
}



}

