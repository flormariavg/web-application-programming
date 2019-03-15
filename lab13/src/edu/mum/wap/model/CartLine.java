package edu.mum.wap.model;

import java.util.ArrayList;
import java.util.List;

public class CartLine {

    private int quantity;
    private List<Item> products;

    public CartLine() {
    	products= new ArrayList<>();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

	public List<Item> getProducts() {
		return products;
	}

	public void addProducts(Item product) {
		this.products.add(product);
	}

	public static List<Item> setItems() {
		Item item= new Item("book1", "Sciense Fiction", 10, 2, true);
		Item item2= new Item("book2", "Technology", 10, 2, true);
		Item item3= new Item("book3", "Stories", 10, 2, true);
		Item item4= new Item("book4", "Health", 10, 2, true);
		
		List<Item>products=new ArrayList<>();
		
		
		products.add(item);
		products.add(item2);
		products.add(item3);
		products.add(item4);
		
		return products;
	}
	
	public static void main(String[] args) {
		List<Item> products = CartLine.setItems();
		for (Item item : products) {
			System.out.println(item);
			
		}
		
	}
}
