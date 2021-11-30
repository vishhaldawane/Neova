package com.example.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Admin")
public class Admin extends Exception {

	
	@Id
	@GeneratedValue
	@Column(name = "adminId")
	private int adminId;
	
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String password;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "retailerAdminID") 
	private Set<Retailer> adminRetailerID;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "productAdminID")
	private Set<Product> adminProductID;

	
	
	//-----------------------------//
	
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Retailer> getAdminRetailerID() {
		return adminRetailerID;
	}

	public void setAdminRetailerID(Set<Retailer> adminRetailerID) {
		this.adminRetailerID = adminRetailerID;
	}

	public Set<Product> getAdminProductID() {
		return adminProductID;
	}

	public void setAdminProductID(Set<Product> adminProductID) {
		this.adminProductID = adminProductID;
	}

	
	//-----------------------------//

	
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", name=" + name + ", password=" + password + ", adminRetailerID="
				+ adminRetailerID + ", adminProductID=" + adminProductID + "]";
	}
	
	
}

