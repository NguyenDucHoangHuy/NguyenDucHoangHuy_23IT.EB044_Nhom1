package Models;

import java.sql.Date;

public class Fresher extends Employee {
private String Graduation_date;
private String Graduation_rank;
private String Education;
public Fresher(int iD, String fullName,String birthday, String email, String phone, int employee_count,
		String employee_type, String graduation_date, String graduation_rank, String education) {
	super(fullName, birthday, email, phone,   employee_type);
	Graduation_date = graduation_date;
	Graduation_rank = graduation_rank;
	Education = education;
}
@Override
public String toString() {
	return "Fresher [Graduation_date=" + Graduation_date + ", Graduation_rank=" + Graduation_rank + ", Education="
			+ Education + "]";
}
public String getGraduation_date() {
	return Graduation_date;
}
public void setGraduation_date(String graduation_date) {
	Graduation_date = graduation_date;
}
public String getGraduation_rank() {
	return Graduation_rank;
}
public void setGraduation_rank(String graduation_rank) {
	Graduation_rank = graduation_rank;
}
public String getEducation() {
	return Education;
}
public void setEducation(String education) {
	Education = education;
}
 
  
}
