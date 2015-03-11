package org.week4;

public class Qualification {

	private int resultGained;
	private String name;

	public int getResultGained() {
		return this.resultGained;
	}

	public void setResultGained(int resultGained) {
		this.resultGained = resultGained;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Qualification(String name, int resultGained) {
		this.name = name;
		this.resultGained = resultGained;
	}

	public String toString() {
		return "Qualification: Name = " + name + ", Result Gained = " + resultGained + "\n";
	}

}
