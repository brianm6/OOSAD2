package org.week3;

public class Teacher extends Professional {

	private String language;
	private String college;

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCollege() {
		return this.college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Teacher() {
		System.out.println("Creating Teacher....");
	}

}
