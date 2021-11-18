package com.example.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.reactive.TransactionCallback;

import com.example.demo.layer2.Address;
import com.example.demo.layer2.Person;
import com.example.demo.layer3.AddressRepoImpl;
import com.example.demo.layer3.BaseRepository;
import com.example.demo.layer3.PersonRepoImpl;

@SpringBootTest
class DemoRelationalMapping11ApplicationTests {

	@Autowired
	PersonRepoImpl p1;
	@Autowired
	AddressRepoImpl a1;
//	@Autowired
//	BaseRepository b1;
	@Test
	void personInsertTest() {
		
		
			Person person1 = new Person();
			person1.setId(11);
			person1.setName("Ram");
			person1.setAge(23);
		
			p1.insertPerson(person1);

			
			
		}
	@Test
	void addressInsertTest(){
		
		Address address1= new Address();
		address1.setAddressNo(101);
		address1.setStreetNo("44/1");
		address1.setArea("Pimple jarve");
                
		a1.insertAddress(address1);
	}
	
	@Test
	void oneToOneTest() {
//		 

//		
		
		Person person = p1.find(Person.class,11);
		Address address =a1.find(Address.class,101);
	       
		person.setAddress(address);
		address.setPerson(person);
		p1.merge(address);
		a1.merge(person);
		
	
	}
//	
//	@Test 
//	void 
//	
//		
		
	}


