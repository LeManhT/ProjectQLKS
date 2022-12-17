/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.sql.*;
import java.util.*;
import qlks.modal.CheckOut;

/**
 *
 * @author Admin
 */
public class CheckOutDao {

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

    public List<CheckOut> getAllCheckOut() throws ClassNotFoundException, SQLException {
        List<CheckOut> checkOuts = new ArrayList<CheckOut>();

        connection = getConnect();

        String sql = "SELECT * FROM KH_CheckOut";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                CheckOut checkOut = new CheckOut();
                checkOut.setID(rs.getInt("ID"));
                checkOut.setName(rs.getString("TenKH"));
                checkOut.setAddr(rs.getString("Diachi"));
                checkOut.setPhone(rs.getString("SDT"));
                checkOut.setGender(rs.getString("gender"));
                checkOut.setRoom(rs.getString("room"));

                checkOuts.add(checkOut);

            }
        } catch (Exception e) {
        }
        
        return checkOuts;
    }
}
