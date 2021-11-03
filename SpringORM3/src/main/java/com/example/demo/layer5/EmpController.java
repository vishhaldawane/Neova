package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

@GetMapping("/get/{eno}")  //localhost:8080/emp/get/1
public Employee getEmployee(@PathVariable("eno") int x)
{
Employee emp;
emp = empRepo.selectEmployee(x);
return emp;
}

@GetMapping("/getAll")  //localhost:8080/dept/get/1
public List <Employee> getEmps()
{
List <Employee> empList;
empList = empRepo.selectEmployeess();
return empList;
}

@PutMapping("/update")
public void updateEmployee(@RequestBody Employee eobj)
{
empRepo.updateEmployee(eobj);
}

@PutMapping("/delete/{eno}")
public void deleteEmployee(@PathVariable("eno") int x)
{
empRepo.deleteEmployee(x);
}

@PostMapping("/insert/{eno}")   //localhost:8080/emp/insert/1
public void insertEmployee(@PathVariable("eno") int x)
{
empRepo.insertEmployee(x);
}


}