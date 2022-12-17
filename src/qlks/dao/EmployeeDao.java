/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

/**
 *
 * @author Admin
 */
import java.sql.*;
import java.util.*;
import qlks.modal.Employee;

public class EmployeeDao {

    private java.sql.Connection connection;

    public java.sql.Connection getConnection() {
        return connection;
    }

    public void setConnection(java.sql.Connection conn) {
        this.connection = conn;
    }

    public java.sql.Connection getConnect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBCconnection.driverName);
        connection = DriverManager.getConnection(JDBCconnection.dbURL, JDBCconnection.dbUser, JDBCconnection.dbPass);
        System.out.println("CONNECTTED!");
        return connection;
    }

    public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException {
        List<Employee> employees = new ArrayList<Employee>();

        connection = getConnect();

        String sql = "SELECT * FROM employee";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("TenNV"));
                employee.setAge(rs.getString("Age"));
                employee.setGender(rs.getString("gender"));
                employee.setJob(rs.getString("job"));
                employee.setLuong(rs.getString("Luong"));
                employee.setPhone(rs.getString("phone"));
                employee.setDiaChi(rs.getString("Diachi"));

                employees.add(employee);

            }
        } catch (Exception e) {
        }
        return employees;
    }
    
    
    public Employee getEmployee(int id) throws ClassNotFoundException, SQLException{
        connection = getConnect();

        String sql = "SELECT * FROM employee where ID = ?";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("ID"));
                employee.setName(rs.getString("TenNV"));
                employee.setAge(rs.getString("Age"));
                employee.setGender(rs.getString("gender"));
                employee.setJob(rs.getString("job"));
                employee.setLuong(rs.getString("Luong"));
                employee.setPhone(rs.getString("phone"));
                employee.setDiaChi(rs.getString("Diachi"));
                
                return employee;

            }
        } catch (Exception e) {
            
        }
        return null;
    }
}
