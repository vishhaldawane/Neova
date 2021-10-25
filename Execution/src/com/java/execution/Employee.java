package com.java.execution;


public class Employee{
private String eid ;  
private String ename;
private long esal;
private String edepartment;

Employee(String id , String name, long sal, String department ) {

this.eid =id;
this.ename = name;
this.esal =sal;
this.edepartment= department;
}

public void display() {
System.out.println("Trainer of this Students are as follows....Below are the personal details ");
}

private String tName;
private String tExpirence;
private String tQualification;
private String tSubject;
private String tAdharCard;
private String tContact;
private String tSal;





public Employee(String tName, String tExpirence, String tQualification, String tSubject, String tAdharCard,
		String tContact, String tSal) {
	super();
	this.tName = tName;
	this.tExpirence = tExpirence;
	this.tQualification = tQualification;
	this.tSubject = tSubject;
	this.tAdharCard = tAdharCard;
	this.tContact = tContact;
	this.tSal = tSal;
}

public void trainerDetails() {
	System.out.println("Trainer Name          : "+ tName);
	System.out.println("Trainer Expirence     : "+ tExpirence);
	System.out.println("Trainer Qualification : "+ tQualification);
	System.out.println("Trainer Subject       : "+ tSubject);
	System.out.println("Trainer Adharcard     : "+ tAdharCard);
	System.out.println("Trainer Contact       : "+ tAdharCard);
	System.out.println("Trainer Salary        : "+ tSal);
}



@Override
public String toString() {
return "Emplpoyee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", edepartment=" + edepartment + "]";
}

}




