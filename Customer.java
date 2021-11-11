package com.java.manytomany;



/*

Customer							Subscription
cid   name  email				sid   duration   type	
1		jack					55	   3 months  DVD
2		jane					66	   6 months	 Books
3		jill
4		joby

		customersubscription
transid		cust_id	sub_id
			1		55
			1		66
			2		55
			2		66
			3		55
			3		66
			4		66
*/
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
//m-m
@Entity(name="Customer2")
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private String email;
	
	//eager vs lazy
	
	@ManyToMany(fetch=FetchType.EAGER, cascade=CascadeType.ALL)
	@JoinTable(name="CustomerSubscriptionLink2", 
			joinColumns={@JoinColumn(name="cust_id")},
			inverseJoinColumns={@JoinColumn(name="sub_id")})
	private Set<Subscription> subscriptions; //getSubscriptions()
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Set<Subscription> getSubscriptions() {
		return subscriptions;
	}
	public void setSubscriptions(Set<Subscription> subscriptions) {
		this.subscriptions = subscriptions;
	}
}
