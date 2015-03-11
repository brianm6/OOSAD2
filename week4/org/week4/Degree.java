package org.week4;

public class Degree extends Qualification {

	private float passMark;
	private float distinctionMark;

	public float getPassMark() {
		return this.passMark;
	}

	public void setPassMark(float passMark) {
		this.passMark = passMark;
	}

	public float getDistinctionMark() {
		return this.distinctionMark;
	}

	public void setDistinctionMark(float distinctionMark) {
		this.distinctionMark = distinctionMark;
	}

	public Degree(String name, int resultGained, int passMark, int distinctionMark) {
		super(name, resultGained);
		this.passMark = passMark;
		this.distinctionMark = distinctionMark;
	}

	public String toString() {
		return "Degree: Pass = " + passMark + ", Distinction = " + distinctionMark + "\n";
	}
}
