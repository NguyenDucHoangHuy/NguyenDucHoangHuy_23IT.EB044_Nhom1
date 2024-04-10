package Controllers;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Models.Employee;
public class Chuc_nang_CRUD {
	  private DAO dao;

	    public Chuc_nang_CRUD(DAO dao) {
	        this.dao = dao;
	    }
 private List<Employee> employees;
 public Chuc_nang_CRUD() {
     this.employees = new ArrayList<>();
 }
 public void createEmployee() {
	 Scanner scanner= new Scanner(System.in);
     System.out.print("Full Name: ");
     String fullName = scanner.nextLine();
     System.out.print("Birthday (yyyy-mm-dd) : ");
     String birthday  = scanner.nextLine();
     System.out.print("Email: ");
     String email = scanner.nextLine();
     System.out.print("Phone: ");
     String phone = scanner.nextLine();
     System.out.print("Employee Type: ");
     String employeeType = scanner.nextLine();
     Employee employee= new Employee(fullName, birthday, email, phone, employeeType);
	dao.addEmployee(employee);
     
 }
public  static void updateEmployee( )  {
	 Scanner scanner= new Scanner(System.in);
     System.out.print("Nhap ID cua nhân viên can cap nhat: ");
     int ID = scanner.nextInt();
     scanner.nextLine();   

     System.out.println("Nhap thong tin moi cho nhan vien:");
     System.out.print("Full Name: ");
     String fullName = scanner.nextLine();
     System.out.print("Birthday (YYYY-MM-DD): ");
     String birthday = scanner.nextLine();
     System.out.print("Email: ");
     String email = scanner.nextLine();
     System.out.print("Phone: ");
     String phone = scanner.nextLine();
     System.out.print("Employee Type: ");
     String employeeType = scanner.nextLine();

     
    
 }

  
  
}
