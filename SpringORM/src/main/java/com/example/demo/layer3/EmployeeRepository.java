package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Employee;


public interface EmployeeRepository {
void insertEmployee(Employee eobj); //C
	
	Employee selectEmployee(int eno); //R
	List<Employee>selectDepartments(); //RA
	
	void updateEmployee(Employee eObj);
	void deleteEmployee(int eno); 
	
}
