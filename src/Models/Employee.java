package Models;

import java.sql.Date;

public class Employee implements Interface_Employee {
	 private static int nextId = 1;
  protected int ID;
  protected String FullName;
  protected String Birthday;
  protected String Email, Phone;
  protected int Employee_count=0;
  protected String Employee_type;
@Override

public void showInfo() {
	 System.out.println("ID: "+ID);
	 System.out.println("FullName: "+FullName);
	 System.out.println("Birthday: "+Birthday);
	 System.out.println("Email: "+Email);
	 System.out.println("Phone: "+Phone);
	 System.out.println("Employee_type: "+Employee_type);
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
@Override
public String toString() {
	return "Employee [ID=" + ID + ", FullName=" + FullName + ", Birthday=" + Birthday + ", Email=" + Email + ", Phone="
			+ Phone + ", Employee_count=" + Employee_count + ", Employee_type=" + Employee_type + "]";
}
public String getBirthday() {
	return Birthday;
}
public void setBirthday(String birthday) {
	Birthday = birthday;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPhone() {
	return Phone;
}
public void setPhone(String phone) {
	Phone = phone;
}
public int getEmployee_count() {
	return Employee_count;
}
public void setEmployee_count(int employee_count) {
	Employee_count = employee_count;
}
public String getEmployee_type() {
	return Employee_type;
}
public void setEmployee_type(String employee_type) {
	Employee_type = employee_type;
}
public Employee(  String fullName, String birthday, String email, String phone,  
		String employee_type) {
	super();
	this.ID = nextId++;
	FullName = fullName;
	Birthday = birthday;
	Email = email;
	Phone = phone;
 
	Employee_type = employee_type;
}
}
