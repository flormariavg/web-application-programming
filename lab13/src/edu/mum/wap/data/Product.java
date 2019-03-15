package edu.mum.wap.data;

import java.util.HashMap;
import java.util.Map;

import edu.mum.wap.model.Item;

public class Product {
	
	public static Map<String, Item> products;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public static Map<String, Item> getProducts() {
		return products;
	}

	public static Map<String, Item> setProducts() {
		Item item= new Item();
		Item item2= new Item();
		Item item3= new Item();
		products=new HashMap<>();
		
		item.setName("item 1");
		item.setQuantity(1);
		item.setUnitPrice(10);
		item.setDescription("desc 1");
		
		item2.setName("item 2");
		item2.setQuantity(2);
		item2.setUnitPrice(20);
		item2.setDescription("desc 2");
		
		item3.setName("item 3");
		item3.setQuantity(3);
		item3.setUnitPrice(15);
		item3.setDescription("desc 3");
		
		products.put("1", item);
		products.put("2", item2);
		products.put("3", item3);
		
		return products;
	}
	
	public static void main(String[] args) {
		Map<String, Item> products = Product.setProducts();
		
		System.out.println(products.get("1"));
		System.out.println(products.get("2"));
		System.out.println(products.get("3"));
	}
}
