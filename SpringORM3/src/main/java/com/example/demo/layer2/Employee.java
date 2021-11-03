package com.example.demo.layer2;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp6")
public class Employee {
	
	@Id
	@Column(name="empnumber")
	private int empnumber;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="job")
	private String job;
	
	@Column(name="mgr")
	private int mgr;
	
	@Column(name="hiredate")
	private ChronoLocalDate hiredate;
	
	@Column(name="salary")
	private float salary;
	
	@Column(name="commission")
	private float commission;
	
	
	//---------------------------get/set-------------------------------------------

	public int getEmpnumber() {
		return empnumber;
	}

	public void setEmpnumber(int empnumber) {
		this.empnumber = empnumber;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
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

	public ChronoLocalDate getHiredate() {
		return hiredate;
	}

	public void setHiredate(ChronoLocalDate hiredate) {
		this.hiredate = hiredate;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getCommission() {
		return commission;
	}

	public void setCommission(float commission) {
		this.commission = commission;
	}

	
	
	//---------------------------get/set-------------------------------------------
	
	

}
