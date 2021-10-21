package com.java.Container;



import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

public class MylinkedList {
	public static void main(String[] args) {

		Facebook log1 = new Facebook("Rahul","Message", LocalDateTime.now()  );
		Facebook log2 = new Facebook("Robin","videoCalling", LocalDateTime.now()  );
		Facebook log3 = new Facebook("Rita","tagfriend", LocalDateTime.now()  );
		Facebook log4 = new Facebook("Sejal","SendRequest", LocalDateTime.now()  );
		Facebook log5 = new Facebook("Smith","Update", LocalDateTime.now()  );
		System.out.println("Content is ready....");
		
		LinkedList<Facebook>   myFacebookList = new LinkedList<Facebook>();
		System.out.println("Container is ready....");
		
		myFacebookList.add(log1);
		myFacebookList.add(log2); //quantum computer
		myFacebookList.add(log3); 
		myFacebookList.add(log4); 
		myFacebookList.add(log5); 
		System.out.println("Content is added to the container..");
		
		
		Iterator<Facebook> logIterator = myFacebookList.iterator();
		
		while(logIterator.hasNext()) {
			Facebook theLog = logIterator.next();
			System.out.println("the Log : "+theLog);
		}
		System.out.println("-----------------");
		for (Facebook Facebook : myFacebookList) {
			System.out.println("the Log : "+Facebook);
		}
	}
}





