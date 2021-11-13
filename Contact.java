package com.lakhan.LinkedList;

public class Contact {
	
	private String name;
	private String emailID;
	private String instagramID;
	private String facebookID;
	private String twitterID;
	private String mobNumber;
	
	public Contact(String name, String emailID, String instagramID, String facebookID, String twitterID,
			String mobNumber) {
		super();
		this.name = name;
		this.emailID = emailID;
		this.instagramID = instagramID;
		this.facebookID = facebookID;
		this.twitterID = twitterID;
		this.mobNumber = mobNumber;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", emailID=" + emailID + ", instagramID=" + instagramID + ", facebookID="
				+ facebookID + ", twitterID=" + twitterID + ", mobNumber=" + mobNumber + "]";
	}
	
	
	
	
}
