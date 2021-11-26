package com.example.pojo;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	@GeneratedValue
	@Column(name = "productId")
	private int productId;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "price")
	private int price;
	
	@Column(name = "image")
	private String image;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "stock_Remaining")
	private int stock_Remaining;

	@ManyToOne
	private Admin productAdminID;
	
	@ManyToOne
	private User productUserID;

	
	//-----------------------------//

	
	public int getproductId() {
		return productId;
	}

	public void setproductId(int productId) {
		this.productId = productId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStock_Remaining() {
		return stock_Remaining;
	}

	public void setStock_Remaining(int stock_Remaining) {
		this.stock_Remaining = stock_Remaining;
	}

	public Admin getProductAdminID() {
		return productAdminID;
	}

	public void setProductAdminID(Admin productAdminID) {
		this.productAdminID = productAdminID;
	}

	public User getProductUserID() {
		return productUserID;
	}

	public void setProductUserID(User productUserID) {
		this.productUserID = productUserID;
	}

	
	//-----------------------------//

	
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", brand=" + brand + ", price=" + price + ", image=" + image
				+ ", description=" + description + ", stock_Remaining=" + stock_Remaining + ", productAdminID="
				+ productAdminID + ", productUserID=" + productUserID + "]";
	}
	
	
	
	
}