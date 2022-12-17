/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.service;


import java.sql.*;
import java.util.*;
import qlks.modal.CheckOut;
import qlks.dao.CheckOutDao;
/**
 *
 * @author Admin
 */
public class CheckOutService {
    private CheckOutDao checkOutDao;

    public CheckOutService() {
        checkOutDao = new CheckOutDao();
    }
    
    public List<CheckOut> getAllCheckOut() throws ClassNotFoundException, SQLException{
        return checkOutDao.getAllCheckOut();
    }
}
