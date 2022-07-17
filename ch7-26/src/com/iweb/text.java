package com.iweb;

import java.sql.*;
//复习  和 mysql乱码如何解决的问题
public class text {
    public static void main(String[] args) {
        Connection conn = null;
        Statement state = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://192.168.77.100:3306/mysql?characterEncoding=utf-8",
                    "root", "123456");
            state = conn.createStatement();
            String sql = "insert into  my_stu values('1','张三',25)";

            int i = state.executeUpdate(sql);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (conn != null)
                    conn.close();
                if (state != null)
                    state.close();
                if (rs != null)
                    rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
