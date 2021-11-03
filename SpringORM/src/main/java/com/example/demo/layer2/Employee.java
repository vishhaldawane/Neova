package com.example.demo.layer2;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="emp6")
public class Employee {

	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return eName;
	}
	public void setEmpName(String empName) {
		this.eName = empName;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public int getCom() {
		return com;
	}
	public void setCom(int com) {
		this.com = com;
	}

	@Id
	@Column(name="empno")
	private int empNo;
	
	@Column(name="ename")
	private String eName;
	
	@Column(name="job")
	private String job;
	
	@Column(name="mgr")
	private int mgr;
	
	@Column(name="hiredate")
	private LocalDate hiredate;
	
	@Column(name="sal")
	private int sal;
	
	@Column(name="com")
	private int com;

	


	
}
