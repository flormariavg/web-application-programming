package edu.mum.wap.model;

import java.io.Serializable;

public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int quantity;
    private Item product;
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
	
}
