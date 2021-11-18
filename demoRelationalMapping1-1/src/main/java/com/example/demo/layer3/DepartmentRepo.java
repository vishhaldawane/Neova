package com.example.demo.layer3;

import java.util.List;

import com.example.demo.layer2.Department;


public interface DepartmentRepo {
	void insertDepartment(Department dobj); // C

	Department selectDepartment(int dno); // R

	List<Department> selectDepartment(); // RA

	void updateDepartment(Department dobj); // U

	void deleteDepartment(int dno); // D

}
