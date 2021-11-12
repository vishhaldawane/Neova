package com.java.manytomany;

import java.util.Set;

import org.junit.Test;

import com.java.util.BaseDao;

public class CustomerSubscriptionTest {

	//84 nikita
	//85 lakhan -- ids for the customer
	
	//86 book
	//87 dvd -- ids for the subscription
	
	
	@Test
	public void testCase1() {
		BaseDao dao = new BaseDao();
		
		Customer cust = new Customer();
		cust.setName("Nikita"); 
		cust.setEmail("nikita@gmail.com");
		System.out.println("customer 1 is created...");
		
		dao.merge(cust);
		System.out.println("customer 1 is merged...");
		
		cust = new Customer();
		cust.setName("Lakhan"); 
		cust.setEmail("lakhan@gates.com");
		System.out.println("customer 2 is created...");
		
		dao.merge(cust);
		System.out.println("customer 2 is merged...");
		
		Subscription subs = new Subscription();
		subs.setType("Book"); 
		subs.setDuration(2);
		System.out.println("Subscription 1 is created...");
		
		dao.merge(subs);
		System.out.println("Subscription 1 is merged...");
		
		
		subs = new Subscription();
		subs.setType("DVD"); 
		subs.setDuration(3);
		System.out.println("Subscription 2 is created...");
		
		dao.merge(subs);
		System.out.println("Subscription 2 is merged...");
	}
	
	@Test
	public void testCase2() {
	//ADD 2 CUSTOMERS(41,42) AND 2 SUBSCRIPTIONS(43,44) AND THEN BELOW CODE
		BaseDao dao = new BaseDao();
		
		Customer cust = dao.find(Customer.class, 85);
		
		Subscription sub1 = dao.find(Subscription.class, 86);
		Subscription sub2 = dao.find(Subscription.class, 87);
		
		cust.getSubscriptions().add(sub1); //fill up the foreign table's fKs, cust_id, sub_id
		cust.getSubscriptions().add(sub2); //fill up the foreign table's fKs, cust_id, sub_id
		
		dao.merge(cust);
	}
	
	@Test
	public void testCase3() {
	//ADD 2 CUSTOMERS(41,42) AND 2 SUBSCRIPTIONS(43,44) AND THEN BELOW CODE
		BaseDao dao = new BaseDao();
		
		Customer cust = dao.find(Customer.class, 84);
		Set<Subscription> subs= cust.getSubscriptions();
		
		for(Subscription sub : subs) {
			System.out.println("Type : "+sub.getType());
		}
		
	}
	
	
	@Test
	public void testCase4() {
	//ADD 2 CUSTOMERS(41,42) AND 2 SUBSCRIPTIONS(43,44) AND THEN BELOW CODE
		BaseDao dao = new BaseDao();
		
		Subscription sub = dao.find(Subscription.class, 86);
		Set<Customer> custs= sub.getCustomers();
		
		for(Customer cust : custs) {
			System.out.println("Customer : "+cust.getName());
		}
		
	}
}
