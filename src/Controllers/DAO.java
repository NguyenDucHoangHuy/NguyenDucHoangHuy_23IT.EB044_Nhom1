package Controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Models.Employee;

public class DAO {
     
	public static Connection getConnection() throws SQLException{
		 Connection c= null;
		  
			  try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			  String url  = "jdbc:sqlserver://localhost:1433;databaseName=QLNV;encrypt=true;trustServerCertificate=true";
			    String user = "sa";
			    String pass = "hoanghuy111205";
			 c= DriverManager.getConnection(url,user,pass);
	    System.out.println("Ket noi thanh cong");
		 return c;
	 }
	 public static void closeConnection(Connection c) {
		 try {
			 if(c!=null) {
				 c.close();
				 System.out.println("Ngat ket noi");
			 }
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
	 }
	 public static void addEmployee(Employee employee) {
	        String sql = "INSERT INTO Employee (FullName, Birthday, Email, Phone, Employee_type) VALUES (?, ?, ?, ?, ?)";
	        try (Connection conn = getConnection();
	             PreparedStatement statement = conn.prepareStatement(sql)) {
	            statement.setString(1, employee.getFullName());
	            statement.setString(2, employee.getBirthday());
	            statement.setString(3, employee.getEmail());
	            statement.setString(4, employee.getPhone());
	            statement.setString(5, employee.getEmployee_type());

	            statement.executeUpdate();
	            System.out.println("Nhan vien moi da duoc them vao co so du lieu.");
	        } catch (SQLException e) {
	            System.out.println("Loi: " + e.getMessage());
	        }
	    }

	    public void updateEmployee(Employee employee) {
	        String sql = "UPDATE Employee SET FullName=?, Birthday=?, Email=?, Phone=?, Employee_type=? WHERE ID=?";
	        try (Connection conn = getConnection();
	             PreparedStatement statement = conn.prepareStatement(sql)) {
	            statement.setString(1, employee.getFullName());
	            statement.setString(2, employee.getBirthday());
	            statement.setString(3, employee.getEmail());
	            statement.setString(4, employee.getPhone());
	            statement.setString(5, employee.getEmployee_type());
	            statement.setInt(6, employee.getID());

	            int rowsUpdated = statement.executeUpdate();
	            if (rowsUpdated > 0) {
	                System.out.println("Thong tin cua nhan vien da cap nhat.");
	            } else {
	                System.out.println("Không tìm thấy nhân viên có ID: " + employee.getID());
	            }
	        } catch (SQLException e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }
	    }
}
