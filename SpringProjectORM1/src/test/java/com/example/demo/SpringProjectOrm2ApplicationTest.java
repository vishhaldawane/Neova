package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;

@SpringBootTest
public class SpringProjectOrm2ApplicationTest {
	
@Autowired
DepartmentRepositoryImpl deptRepo;
@Test
void insertDptTest(){
	Department dept=new Department();
	dept.setDepartmentNumber(372);
	dept.setDepartmentName("It");
	dept.setDepartmentLocation("Akola");
	deptRepo.insertDepartment(dept);
}
}
