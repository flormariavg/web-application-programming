package edu.mum.wap.model;

import java.io.Serializable;
<<<<<<< HEAD
=======
import java.text.DecimalFormat;
>>>>>>> branch 'master' of https://github.com/flormariavg/web-application-programming.git
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String user;

	List<Product> products;
	
	public ShoppingCart() {
<<<<<<< HEAD
		// TODO Auto-generated constructor stub
		products= new  ArrayList<>();
=======
		cartLineList = new ArrayList<CartLine>();
>>>>>>> branch 'master' of https://github.com/flormariavg/web-application-programming.git
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

<<<<<<< HEAD
	public void addProducts(Product product) {
		this.products.add(product);
=======
	public Double calculatedTotalPrice() {
		return cartLineList.stream().flatMap(x -> x.getProducts().stream()).mapToDouble(y-> y.getProduct().getUnitPrice() * y.getQuantity()).sum();

	}
	public double calculateShipping() {
		Random r = new Random();
		DecimalFormat formatter = new DecimalFormat("#0,00");
		double shipping=1000 * r.nextDouble();
		return  Double.parseDouble(formatter.format(shipping));
	}
	public static CartLine setProducts() {

		Item item= new Item("book1", "Sciense Fiction", 10, 2, true);
		Item item2= new Item("book2", "Technology", 10, 2, true);
		Item item3= new Item("book3", "Stories", 10, 2, true);
		Item item4= new Item("book4", "Health", 10, 2, true);

		CartLine car1 = new CartLine();
		Product prod1= new Product();
		prod1.setQuantity(2);
		prod1.setProduct(item);

		Product prod2= new Product();
		prod2.setQuantity(3);
		prod2.setProduct(item2);

		Product prod3= new Product();
		prod3.setQuantity(4);
		prod3.setProduct(item3);

		Product prod4= new Product();
		prod4.setQuantity(1);
		prod4.setProduct(item4);

		car1.addProducts(prod1);
		car1.addProducts(prod2);
		car1.addProducts(prod3);
		car1.addProducts(prod4);


		return car1;

	}
	public void checkout(){
>>>>>>> branch 'master' of https://github.com/flormariavg/web-application-programming.git
	}

	@Override
	public String toString() {
		return "ShoppingCart [user=" + user + ", products=" + products + "]";
	}
<<<<<<< HEAD
	
	
=======

	public void setCartLineList(List<CartLine> cartLineList) {
		this.cartLineList = cartLineList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static void main(String[] args) {
		ShoppingCart shop = new ShoppingCart();
		CartLine car = new CartLine();
		car = ShoppingCart.setProducts();
		shop.addToCart(car);
		System.out.println("total de los productos" + shop.calculatedTotalPrice());
		System.out.println(shop.calculateShipping());
		System.out.println(shop.calculateShipping());
		System.out.println(shop.calculateShipping());

	}
>>>>>>> branch 'master' of https://github.com/flormariavg/web-application-programming.git
}
