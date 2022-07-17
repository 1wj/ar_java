package com.util;

import java.sql.*;

public class JdbcUtil {
    static Connection conn=null;
    static ResultSet rs=null;
    static PreparedStatement ps=null;

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public  static  Connection getconn()  {
        try {
            conn= DriverManager.getConnection("jdbc:mysql://192.168.77.100:3306/mysql?characterEncoding=utf-8",
                    "root", "123456");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;

    }
    public  static void close(){
        try {
            if (conn!=null){
                conn.close();
            }
            if(ps!=null){
                ps.close();
            }
            if(rs!=null)
                rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
