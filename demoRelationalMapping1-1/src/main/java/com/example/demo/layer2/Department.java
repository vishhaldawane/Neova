package com.example.demo.layer2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="tb_dept")
public class Department {
@Id
@Column(name="deptno")
	private int departmentNo;
@Column(name="dname")
private String departmentName;
@Column(name="dloc")	
private String departmentLoc;



//@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "dept") //one Department has Many 
private Set<Person> personSet = new HashSet<Person>();



public int getDepartmentNo() {
	return departmentNo;
}



public void setDepartmentNo(int departmentNo) {
	this.departmentNo = departmentNo;
}



public String getDepartmentName() {
	return departmentName;
}



public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}



public String getDepartmentLoc() {
	return departmentLoc;
}



public void setDepartmentLoc(String departmentLoc) {
	this.departmentLoc = departmentLoc;
}



public Set<Person> getPersonSet() {
	return personSet;
}



public void setPersonSet(Set<Person> personSet) {
	this.personSet = personSet;
}



}
