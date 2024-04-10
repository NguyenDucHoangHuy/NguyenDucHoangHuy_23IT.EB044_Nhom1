package Models;

import java.sql.Date;

public class Experience extends Employee   {
  private String ExpInYear;
  private String ProSkill;
public Experience(int iD, String fullName,String birthday, String email, String phone, int employee_count,
		String employee_type, String expInYear, String proSkill) {
	super(fullName, birthday, email, phone,  employee_type);
	ExpInYear = expInYear;
	ProSkill = proSkill;
}
public String getExpInYear() {
	return ExpInYear;
}
public void setExpInYear(String expInYear) {
	ExpInYear = expInYear;
}
public String getProSkill() {
	return ProSkill;
}
public void setProSkill(String proSkill) {
	ProSkill = proSkill;
}
@Override
public String toString() {
	return "Experience [ExpInYear=" + ExpInYear + ", ProSkill=" + ProSkill + "]";
}
	 
 
	
   
}
