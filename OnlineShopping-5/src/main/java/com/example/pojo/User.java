package com.example.pojo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "USER")
public class User {

	@Id
	@GeneratedValue
	@Column(name = "userId")
	private int userId;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "mobileNumber")
	private long mobileNumber;

	@Column(name = "address")
	private String address;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "orderUserID")
	private List<Order> userOrderID = new ArrayList<Order>();

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "cartUserID")
	private Cart userCartID;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "wishlistUserID")
	private Wishlist userWishlistID;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "productUserId")
	private List<Product> product = new ArrayList<Product>();

	
	public User() {
		super();
	}

	// ---------------------------------//

	
	public User(String name, String email, String password, long mobileNumber, String address,
			List<Order> userOrderID, Cart userCartID, Wishlist userWishlistID, List<Product> product) {
		super();
		
		this.name = name;
		this.email = email;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.userOrderID = userOrderID;
		this.userCartID = userCartID;
		this.userWishlistID = userWishlistID;
		this.product = product;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public List<Order> getUserOrderID() {
		return userOrderID;
	}

	public void setUserOrderID(List<Order> userOrderID) {
		this.userOrderID = userOrderID;
	}

	public Cart getUserCartID() {
		return userCartID;
	}

	public void setUserCartID(Cart userCartID) {
		this.userCartID = userCartID;
	}

	public Wishlist getUserWishlistID() {
		return userWishlistID;
	}

	public void setUserWishlistID(Wishlist userWishlistID) {
		this.userWishlistID = userWishlistID;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
	// ---------------------------------//

	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", userOrderID=" + userOrderID
				+ ", userCartID=" + userCartID + ", userWishlistID=" + userWishlistID + ", product=" + product + "]";
	}

	
}
