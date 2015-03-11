package org.week4;

import org.week4.Rating;

public class Pilot extends Professional {
	private Rating rating;
	private String homeAirport;
	private boolean commercialPlane;

	public String getHomeAirport() {
		return this.homeAirport;
	}

	public void setHomeAirport(String homeAirport) {
		this.homeAirport = homeAirport;
	}

	public boolean getCommercialPlane() {
		return this.commercialPlane;
	}

	public void setCommercialPlane(boolean commercialPlane) {
		this.commercialPlane = commercialPlane;
	}

	public Pilot(String name, String phone, String homeAirport, boolean commercialPlane) {
		super(name, phone);		
		this.homeAirport = homeAirport;
		this.commercialPlane = commercialPlane;
	}

	public void printRating() {
		System.out.println(rating);
	}

	public void addUpdateRating(Rating rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Pilot: Home Airport = " + homeAirport + ", Fly Commercial Planes = " + commercialPlane + "\n";
	}
}
