package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.DepartmentRepository;
import com.example.demo.layer3.DepartmentRepositoryImpl;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@SpringBootTest
class SpringOrm3ApplicationTests {

	@Autowired
	EmployeeRepositoryImpl empRepo;

	@Autowired
	DepartmentRepositoryImpl deptRepo;

	@Test
	void insertDeptTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(2);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Mumbai");

		deptRepo.insertDepartment(dept);
	}

	@Test
	void selectDeptTest() {
		 Department dept = new Department();
		dept = deptRepo.selectDepartment(7654);
		System.out.println("Dept no   :" + dept.getDepartmentNumber());
		System.out.println("Dept name :" + dept.getDepartmentName());
		System.out.println("Dept loc  :" + dept.getDepartmentLocation());

	}

	@Test
	void selectAllDeptTest() {
		List<Department> deptList;
		deptList = deptRepo.selectDepartments();
		for (Department dept : deptList) {
			System.out.println("Dept no   :" + dept.getDepartmentNumber());
			System.out.println("Dept name :" + dept.getDepartmentName());
			System.out.println("Dept loc  :" + dept.getDepartmentLocation());
		}
	}

	@Test
	void updateDeptTest() {
		Department dept = new Department();
		dept.setDepartmentNumber(3);
		dept.setDepartmentName("QA");
		dept.setDepartmentLocation("Mumbai");

		deptRepo.updateDepartment(dept);
	}

	@Test
	void deleteDeptTest() {
		Department dept = new Department();
		dept.getDepartmentNumber();
		deptRepo.deleteDepartment(3);
	}

//--------------------------------------------------------------------//

	/*
	 * @Test void selectAllEmpTest() { // LocalDate ld = ld.of(1997, 06, 02); emp =
	 * empRepo.selectEmployee(1);
	 * 
	 * List <Employee> empList = null;
	 * 
	 * for(Employee emp : empList) {
	 * System.out.println("Emp Number      :"+emp.getEmpnumber());
	 * System.out.println("Emp Name        :"+emp.getEmpName());
	 * System.out.println("Emp Job         :"+emp.getJob());
	 * System.out.println("Emp MGR         :"+emp.getMgr());
	 * System.out.println("Emp Hierdate    :"+emp.getHiredate());
	 * System.out.println("Emp Salary      :"+emp.getSalary());
	 * System.out.println("Emp Commission  :"+emp.getCommission()); //
	 * System.out.println("Emp Dept Number :"+emp.getDeptNumber());
	 * 
	 * empList = empRepo.selectEmployeess(); // empRepo.selectEmployeess();
	 * 
	 * } }
	 */

	@Test
	void insertEmpTest() {
		Employee emp = new Employee();

		LocalDate ld = LocalDate.of(1997, 6, 2);

		emp.setEmpnumber(2);
		emp.setEmpName("Adhakshya");
		emp.setJob("DevOps");
		emp.setMgr(7839);
		emp.setHiredate(ld);
		emp.setSalary(2200);
		emp.setCommission(900);

		empRepo.insertEmployee(emp);
	}

	/*
	 * @Test void updateEmpTest() { Employee emp = new Employee();
	 * 
	 * LocalDate ld = LocalDate.of(1997, 6, 2);
	 * 
	 * emp.setEmpnumber(2); emp.setEmpName("Lakhan"); emp.setJob("DevOps");
	 * emp.setMgr(7839); emp.setHiredate(ld); emp.setSalary(2200);
	 * emp.setCommission(900);
	 * 
	 * empRepo.updateEmployee(emp); }
	 * 
	 * @Test void deleteEmpTest() { Employee emp = new Employee();
	 * 
	 * emp.getEmpnumber(); empRepo.deleteEmployee(2); }
	 * 
	 * @Test void selectEmpTest() { Employee emp ;
	 * 
	 * emp = empRepo.selectEmployee(1);
	 * 
	 * System.out.println("Emp Number      :"+emp.getEmpnumber());
	 * System.out.println("Emp Name        :"+emp.getEmpName());
	 * System.out.println("Emp Job         :"+emp.getJob());
	 * System.out.println("Emp MGR         :"+emp.getMgr());
	 * System.out.println("Emp Hierdate    :"+emp.getHiredate());
	 * System.out.println("Emp Salary      :"+emp.getSalary());
	 * System.out.println("Emp Commission  :"+emp.getCommission());
	 * 
	 * }
	 */

}
