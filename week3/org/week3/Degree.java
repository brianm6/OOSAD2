package org.week3;

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

	public Degree() {
		System.out.println("Creating Degree....");		
	}

}
