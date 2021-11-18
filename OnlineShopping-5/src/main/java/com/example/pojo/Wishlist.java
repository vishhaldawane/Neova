package com.example.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "rishiList")
public class Wishlist {

	@Id
	@GeneratedValue
	private int prodId;
	
	@OneToOne
	private User userIdFK;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public User getUserIdFK() {
		return userIdFK;
	}

	public void setUserIdFK(User userIdFK) {
		this.userIdFK = userIdFK;
	}

	@Override
	public String toString() {
		return "Wishlist [prodId=" + prodId + ", userIdFK=" + userIdFK + "]";
	}
	
	
}
