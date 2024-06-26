package Models;

import java.sql.Date;

public class Intern extends Employee{
	private String Majors,Semester,University_name;

	public Intern(int iD, String fullName, String birthday, String email, String phone, int employee_count,
			String employee_type, String majors, String semester, String university_name) {
		super(fullName, birthday, email, phone,  employee_type);
		Majors = majors;
		Semester = semester;
		University_name = university_name;
	}

	public String getMajors() {
		return Majors;
	}

	public void setMajors(String majors) {
		Majors = majors;
	}

	public String getSemester() {
		return Semester;
	}

	public void setSemester(String semester) {
		Semester = semester;
	}

	public String getUniversity_name() {
		return University_name;
	}

	public void setUniversity_name(String university_name) {
		University_name = university_name;
	}

	@Override
	public String toString() {
		return "Intern [Majors=" + Majors + ", Semester=" + Semester + ", University_name=" + University_name + "]";
	}
	

}
