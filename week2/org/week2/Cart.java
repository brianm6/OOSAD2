package org.week2;

import java.util.*;
import java.util.ArrayList;
import org.week2.CartItem;

public class Cart {

	private ArrayList<CartItem> cartItems;

	public ArrayList<CartItem> getCartItems() {
		return this.cartItems;
	}

	public void setCartItems(ArrayList<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public Cart() {
		System.out.println("Creating Cart...");
		cartItems = new ArrayList<CartItem>();
		CartItem ci = new CartItem();
		cartItems.add(ci);
	}

}
