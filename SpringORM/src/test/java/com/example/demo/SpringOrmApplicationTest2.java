package com.example.demo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Id;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImpl;

public class SpringOrmApplicationTest2 {

	@Autowired
	EmployeeRepositoryImpl empRepo;

	
	@Test
	 Employee  updateEmpTest(){

	Employee emp = new Employee();
	emp.setEmpNo(111);
	emp.setEmpName("fazil");
	emp.setCom(100);
	emp.setHiredate(null);
	emp.setJob("sales");
	emp.setMgr(7369);
	emp.setSal(2000);

	empRepo.updateEmployee(emp);
	return emp;
}
	
	@Test
	void insertEmpTest() {
		
		
		LocalDate ld = LocalDate.of(1997,6,2);
		Employee emp =new Employee();
		emp.setEmpNo(420);
		emp.setEmpName("ram");
		emp.setCom(121);
		emp.setHiredate(ld);
		emp.setJob("IT");
		emp.setMgr(7369);
		emp.setSal(4000);
		
		empRepo.insertEmployee(emp);
	}

}
