package org.week4;

public class Module {

	private String group;
	private float duration;

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public float getDuration() {
		return this.duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}

	public Module(String group, float duration) {
		this.group = group;
		this.duration = duration;
	}

	public String toString() {
		return "Module: Group = " + group + ", Duration = " + duration + "\n";
	}
}
