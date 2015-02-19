package org.week2;

public class Driver {

	private static Cart testCart;

	public static Cart getTestCart() {
		return testCart;
	}

	public static void setTestCart(Cart testCart) {
		testCart = testCart;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Starting....");		
		testCart = new Cart();
	}

}
