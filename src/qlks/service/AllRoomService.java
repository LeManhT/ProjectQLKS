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
import qlks.modal.AllRoom;
import qlks.dao.AllRoomDao;

public class AllRoomService {
    private AllRoomDao allRoomDao;

    public AllRoomService() {
         allRoomDao = new AllRoomDao();
    }
    
    public List<AllRoom> getAllRooms() throws ClassNotFoundException, SQLException {
        return allRoomDao.getAllRooms();
    }
    public AllRoom getRoomByID(String MP) throws ClassNotFoundException, SQLException {
        return allRoomDao.getRoomByID(MP);
    }
    
    
    
}
