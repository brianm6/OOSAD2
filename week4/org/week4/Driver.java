package org.week4;

public class Driver {

	private static Specialisation specialisation;
	private static Qualification qualification;
	private static Rating rating;
	private static Module module;
	private static Doctor doctor;
	private static Professional professional;
	private static Degree degree;
	private static Pilot pilot;
	private static Teacher teacher;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Professional professional = new Professional("Brian", "01-123456");
		System.out.println(professional);

		Qualification qualification = new Qualification("Programming", 90);
		System.out.println(qualification);

		Teacher teacher = new Teacher("John", "01-999888", "C++", "IT-Tallaght");	
		Module module1 = new Module("IT Mgmt", 365 / 2);
		Module module2 = new Module("Programming", 365 / 4);
		teacher.addModule(module1);
		teacher.addModule(module2);
		Degree degree1 = new Degree("IT Mgmt", 90, 40, 65);
		Degree degree2 = new Degree("Programming", 88, 60, 80);
		teacher.addDegree(degree1);
		teacher.addDegree(degree2);
		System.out.println(teacher);

		Rating rating = new Rating(100, 85);
		Pilot pilot = new Pilot("Fred", "01-887744", "Dublin", true);
		pilot.addUpdateRating(rating);
		System.out.println(pilot);

		Doctor doctor = new Doctor("James", "01-445566", "Dr.", 123);
		Specialisation specialisation1 = new Specialisation("Neurology", true);
		Specialisation specialisation2 = new Specialisation("Endocrinology", true);
		doctor.addSpecialty(specialisation1);
		doctor.addSpecialty(specialisation2);
		System.out.println(doctor);

	}

}
