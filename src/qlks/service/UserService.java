/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.service;

import java.sql.SQLException;
import java.util.List;
import qlks.modal.User;
import qlks.dao.UserDao;

/**
 *
 * @author Admin
 */
public class UserService {
    private UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }
    
    public List<User> getAllUsers() throws ClassNotFoundException, SQLException{
        return userDao.getAllUsers();
    }
 
    
    public void deleteUser(int id) throws ClassNotFoundException, SQLException{
        userDao.deleteUser(id);
    }
    
    public User getUserById(int id) throws ClassNotFoundException, SQLException {
        return userDao.getUserById(id);
    }

}
    