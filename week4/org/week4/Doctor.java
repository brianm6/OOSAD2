package org.week4;

import org.week4.Specialisation;
import java.util.List;
import java.util.ArrayList;

public class Doctor extends Professional {
	private List<Specialisation> specialisations;
	private String title;
	private int hospitalID;

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getHospitalID() {
		return this.hospitalID;
	}

	public void setHospitalID(int hospitalID) {
		this.hospitalID = hospitalID;
	}

	public Doctor(String name, String phone, String title, int hospitalID) {
		super(name, phone);	
		this.title = title;
		this.hospitalID = hospitalID;
		specialisations = new ArrayList<>();
	}

	public void printSpecialties() {
		for (Specialisation spec : specialisations) {
      			System.out.println(spec);
    		}
	}

	public void addSpecialty(Specialisation specialisation) {
		specialisations.add(specialisation);
	}

	public String toString() {
		return "Doctor: Title = " + title + ", Hospital ID = " + hospitalID + "\n";
	}
}
