package edu.mum.wap.model;

import java.util.Objects;

public class Item {

	private int id;
	private String code;
	private String name;
	private String description;
	private double unitPrice;
	private int quantity;
	private boolean inStock;

	public Item() {
//		this.code = UUID.randomUUID().toString();
		this.code = name+hashCode();
	}

	public Item(int id, String name,  String description, double unitPrice, int quantity, boolean inStock) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.inStock = inStock;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj==null)
			return false;
		Item product = (Item)obj;
		return product.name.equals(this.name);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", code=" + code + ", name=" + name + ", description=" + description
				+ ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", inStock=" + inStock + "]";
	}


	
}
