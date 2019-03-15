package edu.mum.wap.model;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity;
    private Item product;
    public Product() {
		// TODO Auto-generated constructor stub
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Item getProduct() {
		return product;
	}
	public double getProductPrice(Item prod) {
		return prod.getUnitPrice();
	}
	public void setProduct(Item product) {
		this.product = product;
	}
	public Product(Item prod, int q) {
		this.product = prod;
		this.quantity = q;
	}
}
