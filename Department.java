package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dept5")
public class Department {

	@Id
	@Column(name="deptno")
	private int departmentNumber;
	
	@Column(name="dname")
	private String departmentName;
	
	@Column(name="loc")
	private String departmentLocation;
	
	
	public int getDepartmentNumber() {
		return departmentNumber;
	}
	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentLocation() {
		return departmentLocation;
	}
	public void setDepartmentLocation(String departmentLocation) {
		this.departmentLocation = departmentLocation;
	}
	
	
	
}


/*

@Entity
@Table(name="dept5")
class Dept
{
 	@Id <-- Pk
 	@Column("deptno") int departmentNumber 
 	
 	@Column String dname 
 	@Column String dloc
 	
 	@OneToMany
	private Set<Employee> staff = new HashSet<Employee>();
	
}
Employee e1; e2; e3 .... setters of e1,e2,e3
Dept d = new Dept(); d.se 10 ACC NY
d.staff.add(e1);
d.staff.add(e2);
d.staff.add(e3);

em.persist(d);
---

Dept d = em.find(Dept.class,10);

Set myset = d.getStaff()

@Table(emp
class Employee extends Dept //wrong way 
{
	@Id
	int empno	
	
	ename job sal
	
	@JoinColumn(name="dno")
	private int departmentNumber;
}

class Report
class Student 
{
   ArrayList<Report> reportCards = new Report();
   
}
one department can have many employees
onetomany

	dept <--parent table		
	PK
	deptno	dname  loc
	10		ACCS   NY <-- row(DB) / obj(ORM)
	20		IT
	30		SALES
	
	emp <-- child table
	PK					   (FK)
	empno	ename job sal  dno
	102		jack  acc 505	10
	202		jane  dev 600   20
	333		jill  sal 600   30
	444		joby  cle 800   10
	
	BUS DEV EXE -> client
	
	
	Developer
	tester
	project manager
	|
	bus dev executive
	|
	pampers <-- client
	|
	




*/