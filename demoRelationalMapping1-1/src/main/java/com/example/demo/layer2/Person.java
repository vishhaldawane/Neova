package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "person")
public class Person {
	@Id
	@Column(name = "person_id")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private  int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_age")
	private int age;

	
	
	@OneToOne
	private Address address;

//	
//	@ManyToOne
//	@JoinColumn(name="deptno") // FK for emp table
	private Person person;
	

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
