package org.week3;

public class Rating extends Qualification {

	private float rateMax;
	private float rateValue;

	public float getRateMax() {
		return this.rateMax;
	}

	public void setRateMax(float rateMax) {
		this.rateMax = rateMax;
	}

	public float getRateValue() {
		return this.rateValue;
	}

	public void setRateValue(float rateValue) {
		this.rateValue = rateValue;
	}

	public Rating() {
		System.out.println("Creating Rating....");
	}

}
