package com.iweb.mysql;

import java.sql.*;

public class Mysql {
    public static void main(String[] args) {
        Connection conn=null;
        Statement state=null;
        ResultSet rs=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://192.168.77.100:3306/mysql","root","123456");
            state=conn.createStatement();
            String sql="select * from my_user";
            rs=state.executeQuery(sql);
            while (rs.next()){
                String id = rs.getString("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                System.out.println("id==="+id+",username==="+username+",password==="+password);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (conn!=null)
                    conn.close();
                if (state!=null)
                    state.close();
                if(rs!=null)
                    rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
