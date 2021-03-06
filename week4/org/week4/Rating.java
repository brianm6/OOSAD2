package org.week4;

public class Rating extends Qualification {

	private int rateMax;
	private int rateValue;

	public int getRateMax() {
		return this.rateMax;
	}

	public void setRateMax(int rateMax) {
		this.rateMax = rateMax;
	}

	public int getRateValue() {
		return this.rateValue;
	}

	public void setRateValue(int rateValue) {
		this.rateValue = rateValue;
	}

	public Rating(int rateMax, int rateValue) {
		super("Pilot Rating", rateValue);		
		this.rateMax = rateMax;
		this.rateValue = rateValue;
	}

	public String toString() {
		return "Rating: Max = " + rateMax + ", Value = " + rateValue + "\n";
	}

}
