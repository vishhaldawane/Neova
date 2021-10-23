package com.java.container;

public class Contact 
{

	private int phoneNo;
	private String Name;
	private String Email_id;
	private String Instagram;
	public Contact(int phoneNo, String name, String email_id, String instagram) {
		super();
		this.phoneNo = phoneNo;
		this.Name = name;
		this.Email_id = email_id;
		this.Instagram = instagram;
	}
	@Override
	public String toString() {
		return "LinkListTest [phoneNo=" + phoneNo + ", Name=" + Name + ", Email_id=" + Email_id + ", Instagram="
				+ Instagram + "]";
	}
	
	
	
	
	
	
}
