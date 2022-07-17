package com.iweb.参数绑定;

import java.sql.*;
//使用参数绑定
public class Test2 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.77.100:3306/mysql?characterEncoding=utf-8",
                    "root", "123456");
            String sql="select * from my_user where username=? and password=? ";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"root");
            ps.setString(2,"123456");
           rs = ps.executeQuery();
           while(rs.next()){
               String id = rs.getString("id");
               String username = rs.getString("username");
               String  passwd = (String) rs.getObject(3);
               System.out.println(id+",username="+username+",password="+passwd);
           }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
                if (ps != null)
                    ps.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
