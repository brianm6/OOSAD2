package org.week4;

public class Professional {

	protected String name;
	protected String phone;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Professional(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public String toString() {
		return "Professional: Name = " + name + ", Phone = " + phone + "\n";
	}
}
