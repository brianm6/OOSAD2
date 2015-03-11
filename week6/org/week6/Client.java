package org.week6;

import org.week6.Singleton;

public class Client {
	static Singleton singleton1;
	static Singleton singleton2;
	public static void main(String[] args) {
		Singleton.printInstanceCounts();
		singleton1 = Singleton.getInstance();
		Singleton.printInstanceCounts();
		singleton2 = Singleton.getInstance();
		Singleton.printInstanceCounts();
	}
}
