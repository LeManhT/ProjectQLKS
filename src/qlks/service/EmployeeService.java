/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.service;

/**
 *
 * @author Admin
 */

import java.sql.*;
import java.util.*;
import qlks.dao.EmployeeDao;
import qlks.modal.Employee;

public class EmployeeService {
    private EmployeeDao employeeDao;

    public EmployeeService() {
        employeeDao = new EmployeeDao();
    }
    
    public List<Employee> getAllEmployee() throws ClassNotFoundException, SQLException{
        return employeeDao.getAllEmployee();
    }
    
    public Employee getEmployee(int id) throws ClassNotFoundException, SQLException{
        return employeeDao.getEmployee(id);
    }
    
    
}
