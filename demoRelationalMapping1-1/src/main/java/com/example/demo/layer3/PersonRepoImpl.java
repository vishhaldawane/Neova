package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Person;
@Repository
public class PersonRepoImpl extends BaseRepository implements PersonRepo {

	@Transactional
	public void insertPerson(Person pobj) {
		super.persist(pobj); 

	}

	@Override
	public Person selectPerson(int pno) {
		Person person = super.find(Person.class, pno);
		return person;
	
	}

	@Override
	public List<Person> selectPerson() {
		List<Person>  personList = new ArrayList<Person>();
		return super.findAll("Person");
	}

	@Transactional
	public void updatePerson(Person pobj) {
		super.merge(pobj);

	}

	@Transactional
	public void deletePerson(int pno) {
		super.remove(Person.class, pno);

	}

}
