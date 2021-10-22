package com.java.Container;

public class Book {
	

	private int number;
	private String title;
	private String author;
	private int numberOfPages;
	private double cost;
	private int edition;
	 
	

	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + edition;
		result = prime * result + number;
		result = prime * result + numberOfPages;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
			
		} else if (!author.equals(other.author))
			return false;
		
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		
		if (edition != other.edition)
			return false;
		
		if (number != other.number)
			return false;
		
		if (numberOfPages != other.numberOfPages)
			return false;
		
		if (title == null) {
			if (other.title != null)
				return false;
			
		} else if (!title.equals(other.title))
			return false;
		
		return true;
	}


	public Book() {
		 
	 }
	

public Book(int number, String title, String author, int numberOfPages, double cost, int edition) {
	super();
	this.number = number;
	this.title = title;
	this.author = author;
	this.numberOfPages = numberOfPages;
	this.cost = cost;
	this.edition = edition;
}


@Override
public String toString() {
	return "Book [number=" + number + ", title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages
			+ ", cost=" + cost + ", edition=" + edition + "]";
}

}
