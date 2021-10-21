package com.java.container.LinkedList;

import java.time.LocalDateTime;

public class PhoneContact {
	
	private String name; //julie
	private String email; // missed
	private double mobile; //10-Oct-2021 12:30:00
	private String instaID;
	private String fbID;
	
	public PhoneContact(String name, String email, double mobile, String instaID, String fbID) 
	{
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		this.instaID = instaID;
		this.fbID = fbID;
	}

	@Override
	public String toString() {
		return "PhoneContact [name=" + name + ", email=" + email + ", mobile=" + mobile + ", instaID=" + instaID
				+ ", fbID=" + fbID + "]";
	}
	
	
	
	
	

	
	
}
