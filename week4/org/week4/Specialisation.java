package org.week4;

public class Specialisation extends Qualification {

	private boolean verified;
	private String area;

	public boolean getVerified() {
		return this.verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public String getArea() {
		return this.area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Specialisation(String area, boolean verified) {
		super(area + " Specialisation", 0);		
		this.area = area;
		this.verified = verified;
	}

	public String toString() {
		return "Specialisation: Verified = " + verified + ", Area = " + area + "\n";
	}
}
