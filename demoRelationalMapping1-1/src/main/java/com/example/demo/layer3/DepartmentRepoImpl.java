package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Person;

public class DepartmentRepoImpl extends BaseRepository implements DepartmentRepo {

	@Override
	public void insertDepartment(Department dobj) {
		super.persist(dobj); 
	}

	@Override
	public Department selectDepartment(int dno) {
		Department department = super.find(Department.class, dno);
		return department;
	
	}

	@Override
	public List<Department> selectDepartment() {
		List<Department>  departmentList = new ArrayList<Department>();
		return super.findAll("Department");
	}

	@Override
	public void updateDepartment(Department dobj) {
		super.merge(dobj);

	}

	@Override
	public void deleteDepartment(int dno) {
		super.remove(Person.class, dno);

	}

}
