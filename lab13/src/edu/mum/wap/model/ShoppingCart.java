package edu.mum.wap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user;

	List<Product> products;
	
	public ShoppingCart() {
		// TODO Auto-generated constructor stub
		products= new  ArrayList<>();
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
		this.products.add(product);
	}

	@Override
	public String toString() {
		return "ShoppingCart [user=" + user + ", products=" + products + "]";
	}
	
	
}
