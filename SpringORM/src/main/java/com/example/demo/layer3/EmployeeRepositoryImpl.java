package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Employee;



@Repository
public class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository {





public EmployeeRepositoryImpl() {
System.out.println("EmployeeRepositoryImpl ..");
}

@Transactional
public void insertEmployee(Employee eobj) {

super.persist(eobj); // invoking the dummy persist of the super class
System.out.println("employee inserted...");
}

@Override
public Employee selectEmployee(int eno) {
// TODO Auto-generated method stub
System.out.println("EmployeeRepositoryImpl : selecting employee by empno");
Employee emp = super.find(Employee.class, eno);

return emp;
}


public List<Employee> selectEmployee() {
List<Employee>  empList = new ArrayList<Employee>();

System.out.println("EmployeeRepositoryImpl : Selecting all employee...");
return super.findAll("Employee");

}

@Transactional
@Override
public void updateEmployee(Employee eobj) {
// TODO Auto-generated method stub
System.out.println("EmployeeRepositoryImpl : Updating Employee...");
super.merge(eobj);
}
 
@Transactional
@Override
public void deleteEmployee(int eno) {
// TODO Auto-generated method stub
System.out.println("EmployeeRepositoryImpl : Deleting employee");
super.remove(Employee.class, eno);
}

@Override
public List<Employee> selectDepartments() {
// TODO Auto-generated method stub
return null;
}

}