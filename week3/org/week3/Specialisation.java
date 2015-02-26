package org.week3;

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

	public Specialisation() {
		System.out.println("Creating Specialisation....");
	}

}
