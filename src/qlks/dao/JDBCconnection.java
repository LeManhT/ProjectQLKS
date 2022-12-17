/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlks.dao;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author Admin
 */
public class JDBCconnection {
            public static String hostname = "localhost";
        public static String sqlInstanceName = "DELL\\SQLEXPRESS";
         public static  String sqlDatabase = "BookStore";
    public static String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

//localhost:<PORT>  databaseName=<Tên của database vừa tạo>
    public static String dbURL =  "jdbc:sqlserver://" + hostname + ":1433" 
                    + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase +";encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";


// Vẫn chừa trống, mặc dù không dùng
    public static String dbUser = "sa";
    public static String dbPass = "M@050902";
}
