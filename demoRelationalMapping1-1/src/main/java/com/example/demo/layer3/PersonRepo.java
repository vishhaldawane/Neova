package com.example.demo.layer3;

import java.util.List;


import com.example.demo.layer2.Person;

public interface PersonRepo  {
	void insertPerson(Person pobj); // C

	Person selectPerson(int pno); // R

	List<Person> selectPerson(); // RA

	void updatePerson(Person pobj); // U

	void deletePerson(int pno); // D

}
