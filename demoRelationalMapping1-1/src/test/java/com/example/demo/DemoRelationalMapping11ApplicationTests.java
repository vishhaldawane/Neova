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
import com.example.demo.layer2.Department;
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
		
		
			Person person2 = new Person();
			person2.setId(16);
			person2.setName("Ram5");
			person2.setAge(23);
		
			p1.insertPerson(person2);

			Person person3 = new Person();
			person3.setId(12);
			person3.setName("ram1");
			person3.setAge(23);
		
			p1.insertPerson(person3);

			Person person4 = new Person();
			person4.setId(13);
			person4.setName("Ram2");
			person4.setAge(23);
		
			p1.insertPerson(person4);

			Person person5 = new Person();
			person5.setId(14);
			person5.setName("Ram3");
			person5.setAge(23);
		
			p1.insertPerson(person5);

			Person person6 = new Person();
			person6.setId(15);
			person6.setName("Ram4");
			person6.setAge(23);
		
			p1.insertPerson(person6);

			
			
		}
	@Test
	void addressInsertTest(){
		
		Address address2= new Address();
		address2.setAddressNo(102);
		address2.setStreetNo("44/1");
		address2.setArea("Pimple jarve");
                
		a1.insertAddress(address2);

		Address address3= new Address();
		address3.setAddressNo(103);
		address3.setStreetNo("44/1");
		address3.setArea("Pimple jarve");
                
		a1.insertAddress(address3);

		Address address4= new Address();
		address4.setAddressNo(104);
		address4.setStreetNo("44/1");
		address4.setArea("Pimple jarve");
                
		a1.insertAddress(address4);
		Address address5= new Address();
		address5.setAddressNo(105);
		address5.setStreetNo("44/1");
		address5.setArea("Pimple jarve");
                
		a1.insertAddress(address5);

		Address address6= new Address();
		address6.setAddressNo(106);
		address6.setStreetNo("44/1");
		address6.setArea("Pimple jarve");
                
		a1.insertAddress(address6);
	}
	
	@Test
	void oneToOneTest() {
//		 

//		
		
//		Person person = p1.find(Person.class,11);
		Person person2 = p1.find(Person.class,12);
		Person person3 = p1.find(Person.class,13);
		Person person4 = p1.find(Person.class,14);
		Person person5 = p1.find(Person.class,15);
		Person person6 = p1.find(Person.class,16);
//		Address address =a1.find(Address.class,101);
	       
		Address address2 =a1.find(Address.class,102);
		Address address3 =a1.find(Address.class,103);
		Address address4 =a1.find(Address.class,104);
		Address address5 =a1.find(Address.class,105);
		Address address6 =a1.find(Address.class,106);
		
//		person.setAddress(address);
		person2.setAddress(address2);
		person3.setAddress(address3);
		person4.setAddress(address4);
		person5.setAddress(address5);
		person6.setAddress(address6);
		
//		address.setPerson(person);

		address2.setPerson(person2);

		address3.setPerson(person3);

		address4.setPerson(person4);

		address5.setPerson(person5);

		address6.setPerson(person6);
		p1.merge(address2);
		p1.merge(address3);
		p1.merge(address4);
		p1.merge(address5);
		p1.merge(address6);

		
		
		
		a1.merge(person2);

		a1.merge(person3);

		a1.merge(person4);

		a1.merge(person5);

		a1.merge(person6);
		
	
	}
//	
	@Test 
	void deptInsertTest() {
		Department department=new Department();
		department.setDepartmentNo(10);
		department.setDepartmentName("Test");
		department.setDepartmentLoc("Pune");
	}
//	
//		
		
	}


