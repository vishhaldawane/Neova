package com.example.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "WishList")
public class Wishlist {

	@Id
	@GeneratedValue
	@Column(name = "wishlistId")
	private int wishlistId;	
	
	@OneToOne
	private User wishlistUserID;
	
	
	//---------------------------------//


	public int getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(int wishlistId) {
		this.wishlistId = wishlistId;
	}

	public User getWishlistUserID() {
		return wishlistUserID;
	}

	public void setWishlistUserID(User wishlistUserID) {
		this.wishlistUserID = wishlistUserID;
	}

	
	//---------------------------------//

	
	@Override
	public String toString() {
		return "Wishlist [wishlistId=" + wishlistId + ", wishlistUserID=" + wishlistUserID + "]";
	}
	
}

