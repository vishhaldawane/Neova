package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Employee;
import com.example.demo.layer3.EmployeeRepositoryImpl;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired EmployeeRepositoryImpl empRepo;
	
	@GetMapping("/get/{eno}") //localhost:8080/dept/get/371
	public Employee getDept(@PathVariable("empno") int x) {
		
		Employee emp ; 
		emp = empRepo.selectEmployee(x);
		return emp;
	}
	
	@GetMapping("/getAll")  //localhost:8080/dept/getAll
	public List<Employee> getEmps() {
		
		List<Employee> empList ; 
		empList = empRepo.selectEmployee();
		return empList;
	}
	
	@PostMapping("/add")  //localhost:8080/dept/add
	public void addEmp(@RequestBody Employee empObj){
		
		empRepo.insertEmployee(empObj);
	}
	
	@PutMapping("/update")  //localhost:8080/dept/update
	public void updateEmp(@RequestBody Employee empObj){
		
		empRepo.updateEmployee(empObj);
	}
	
	@DeleteMapping("/delete")  //localhost:8080/dept/delete
	public void deleteEmo(@RequestBody int empObj){
		
		empRepo.deleteEmployee(empObj);
	}
	
	

}