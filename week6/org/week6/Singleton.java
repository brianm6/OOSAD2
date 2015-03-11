package org.week6;

public class Singleton {
	private static int requests = 0;
	private static int created = 0; 
	private static Singleton instance;

	private Singleton() {

	}
 	
	public static Singleton getInstance() {
		requests++;		
		if (instance == null) {
 			instance = new Singleton();
			created++;
		}
		return instance;
	}
	
	public static void printInstanceCounts() {
		System.out.println("Requested objects: " + requests);
		System.out.println("Created objects: " + created);
	}
	
	public static int getRequestCount() {
		return requests;
	}		

	public static int getCreatedCount() {
		return created;
	}
}
