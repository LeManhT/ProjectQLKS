/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import qlks.modal.AllRoom;

/**
 *
 * @author Admin
 */
public class AllRoomDao {

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

    public List<AllRoom> getAllRooms() throws ClassNotFoundException, SQLException {
        List<AllRoom> allRooms = new ArrayList<AllRoom>();

        connection = getConnect();

        String sql = "SELECT * FROM Loai_Phong";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                AllRoom allRoom = new AllRoom();
                allRoom.setMaPhong(rs.getString("MaPhong"));
                allRoom.setTinhTrang(rs.getString("tinhTrang"));
                allRoom.setCleanStatus(rs.getString("cleanStatus"));
                allRoom.setBedType(rs.getString("bedType"));
                allRoom.setGia(rs.getString("Gia"));

                allRooms.add(allRoom);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return allRooms;
    }

    public AllRoom getRoomByID(String MP) throws ClassNotFoundException, SQLException {

        connection = getConnect();

        String sql = "SELECT * FROM Loai_Phong where MaPhong = N'"+MP+"'";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                AllRoom allRoom = new AllRoom();
                allRoom.setMaPhong(rs.getString("MaPhong"));
                allRoom.setTinhTrang(rs.getString("tinhTrang"));
                allRoom.setCleanStatus(rs.getString("cleanStatus"));
                allRoom.setBedType(rs.getString("bedType"));
                allRoom.setGia(rs.getString("Gia"));

                return allRoom;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
