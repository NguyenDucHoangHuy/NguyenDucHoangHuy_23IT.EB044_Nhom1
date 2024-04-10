package Views;

import java.util.Scanner;

import Controllers.Chuc_nang_CRUD;

public class test {
public static void main(String[] args) {
	boolean running=true;
	Chuc_nang_CRUD crud= new Chuc_nang_CRUD();
	int cv = 0;
	Scanner sc= new Scanner(System.in);
 while(running) {
	System.out.println("MENU:");
	System.out.println("1.Creat Employee.");
	System.out.println("2.Update Employee.");
	System.out.println("3.Delete Employee.");
	System.out.println("4.Show Info");
	System.out.println("5.Exit");
	System.out.println("Chon cong viec thuc hien: ");
	cv=sc.nextInt();
	switch(cv) {
	case 1:
		crud.createEmployee();
		break;
	case 2:
		
		break;
	case 5: 
		System.out.println("Exit");
		running=false;
		break;
	}
}
}
}
