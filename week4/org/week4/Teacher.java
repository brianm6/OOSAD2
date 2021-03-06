package org.week4;

import org.week4.Degree;
import org.week4.Module;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends Professional {

	private String language;
	private String college;
	private List<Module> modules;
	private List<Degree> degrees;

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

	public Teacher(String name, String phone, String language, String college) {
		super(name, phone);
		this.language = language;
		this.college = college;
		modules = new ArrayList<>();
		degrees = new ArrayList<>();
	}

	public void printModules() {
		for (Module mod : modules) {
      			System.out.println(mod);
    		}
	}

	public void printDegrees() {
		for (Degree deg : degrees) {
      			System.out.println(deg);
    		}
	}

	public void addModule(Module mod) {
		modules.add(mod);
	}

	public void addDegree(Degree deg) {
		degrees.add(deg);
	}

	public String toString() {
		String result = "Teacher: Language = " + language + ", College = " + college + "\n";
		result += "Degrees: ";		
		for (Degree deg : degrees) {
      			result += deg;
    		}
		result += "Modules: ";		
		for (Module mod : modules) {
      			result += mod;
    		}
		return result;
	}
}
