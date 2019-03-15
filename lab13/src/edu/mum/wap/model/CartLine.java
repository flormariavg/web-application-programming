package edu.mum.wap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CartLine implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private List<Product> products;
    
    public CartLine() {
		// TODO Auto-generated constructor stub
    	products= new ArrayList<>();
	}

	public List<Product> getProducts() {
		return products;
	}

	public void addProducts(Product product) {
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
