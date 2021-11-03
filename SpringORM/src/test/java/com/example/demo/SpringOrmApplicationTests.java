package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.DepartmentRepositoryImpl;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@SpringBootTest
class SpringOrmApplicationTests {

	@Autowired
	EmployeeRepositoryImpl empRepo;
	@Autowired
	DepartmentRepositoryImpl deptRepo;
	@Test
	void insertDeptTest() {
		
		Department dept =new Department();
		dept.setDepartmentNumber(20);
		dept.setDepartmentName("daaa");
		dept.setDepartmentLocation("pune");
		
		dept.setDepartmentNumber(21);
		dept.setDepartmentName("sales");
		dept.setDepartmentLocation("bng");
		
		dept.setDepartmentNumber(22);
		dept.setDepartmentName("it");
		dept.setDepartmentLocation("ny");
		
		
	}
	@Test
	void selectDeptTest() {
		
		Department dept;
		dept = deptRepo.selectDepartment(20);
		System.out.println("Dept no  :" +dept.getDepartmentNumber());
		System.out.println("Dept name:" +dept.getDepartmentName());
		System.out.println("Dept loc :" +dept.getDepartmentLocation());
	}
	@Test
	void SelectAllDeptTest() {
		List<Department>deptList;
		deptList = deptRepo.selectDepartments();
		for(Department dept : deptList) {
			System.out.println("Dept no:" +dept.getDepartmentNumber());
			System.out.println("Dept name:" +dept.getDepartmentName());
			System.out.println("Dept loc :" +dept.getDepartmentLocation());
		}
	}
	@Test
	void updateDeptTest() {
		
		
		Department dept = new Department();
		dept.setDepartmentNumber(20);
		dept.setDepartmentName("research");
		dept.setDepartmentLocation("hawai");
		deptRepo.updateDepartment(dept);
	}
		@Test
		void deleteDeptTest() {
			
			
			deptRepo.deleteDepartment(21);
			
	} 
		//insert into emp
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
//update into emp		

	@Test
		 void updateEmpTest(){

		Employee emp = new Employee();
		LocalDate ld = LocalDate.of(2008, 6, 1);
		emp.setEmpNo(1322);
		emp.setEmpName("gooday");
		emp.setCom(100);
		emp.setHiredate(ld);
		emp.setJob("manager");
		emp.setMgr(7369);
		emp.setSal(2000);

		empRepo.updateEmployee(emp);
	
	} 
		
	//delete emp
 	@Test
		void deleteEmpTest()
		{
			Employee emp = new Employee();
			emp.getEmpNo();
			empRepo.deleteEmployee(1322);
		}
	
	//select emp
	@Test
	void selectEmpTest() {
		Employee emp;
		emp = empRepo.selectEmployee(420);
		
		System.out.println("emp no :" +emp.getEmpNo());
		System.out.println("emp name :" +emp.getEmpName());
		System.out.println("emp job :" +emp.getJob());
		System.out.println("emp mgr :" +emp.getMgr());
		System.out.println("emp hire date:" +emp.getHiredate());
		System.out.println("emp sal :" +emp.getSal());
		System.out.println("com :" +emp.getCom());
	}
		
}

//----------------------------------------------------------------------------------------------
