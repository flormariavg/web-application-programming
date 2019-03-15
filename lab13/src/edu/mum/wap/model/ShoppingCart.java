package edu.mum.wap.model;

import java.io.Serializable;
import java.util.List;

public class ShoppingCart implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;

	List<CartLine> cartLineList;

	public ShoppingCart() {
	}

	public void addToCart(CartLine cartLine){
		cartLineList.add(cartLine);
	}

	public void removeFromCart(CartLine cartLine){
		cartLineList.remove(cartLine);
	}

	public void changeQuantity(CartLine cartLine){
	}

	public void checkout(){
	}

	public List<CartLine> getCartLineList() {
		return cartLineList;
	}

	public void setCartLineList(List<CartLine> cartLineList) {
		this.cartLineList = cartLineList;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
