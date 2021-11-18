package com.example.demo.layer2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	
}
