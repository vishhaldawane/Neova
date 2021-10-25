package com.java.execution;

import java.util.ArrayList;
import java.util.Iterator;

public class Trainer {

	public static void main(String[] args) {
		Employee trainer1 =new Employee("Vishal","25years","B.E Mechanical","Java","1010 2020 6363","3032149874", "100000");
		Employee trainer2 =new Employee("Sachin","12years","B.E Mechanical","Python","1010 2020 6363","3032149874", "100000");
		Employee trainer3 =new Employee("Santosh","14years","B.E Mechanical","c++","1010 2020 6363","3032149874", "100000");
		Employee trainer4 =new Employee("Aushitosh","19years","B.E Mechanical","Sql","1010 2020 6363","3032149874", "100000");
		Employee trainer5 =new Employee("Anmay","22years","B.E Mechanical","WebTech","1010 2020 6363","3032149874", "100000");
		Employee trainer6 =new Employee("Vishal","5years","B.E Mechanical","Java","1010 2020 6363","3032149874", "100000");
	   
		ArrayList<Employee> ourTrainer=new ArrayList<Employee>();
		ourTrainer.add(trainer1);
		ourTrainer.add(trainer2);
		ourTrainer.add(trainer3);
		ourTrainer.add(trainer4);
		ourTrainer.add(trainer5);
		ourTrainer.add(trainer6);
//	
//	for (Iterator iterator = ourTrainer.iterator(); iterator.hasNext();) {
//		Employee employee = (Employee) iterator.next();
//		System.out.println("Employee Details" + ourTrainer);
//		
//	}
//	
	for (Employee employee : ourTrainer) {
		
		ourTrainer.trainerDetails();
	}
	}


	
}	
