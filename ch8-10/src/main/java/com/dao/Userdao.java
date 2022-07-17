package com.dao;


import com.domain.User;
import com.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Userdao {
        public int serlect(String name,String passwd){

            String sql="select count(*) from user where id=? and password=?";
            int num=0;
           Connection conn=JdbcUtil.getconn();
            User user=null;
            try {
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,Integer.valueOf(name));
                ps.setString(2,passwd);
                ResultSet rs=ps.executeQuery();
                while (rs.next()){
                 /* user=new User(rs.getInt("id"),rs.getString("username"),
                         rs.getString("password"),rs.getString("fullname"));*/
                    num=rs.getInt("count(*)");
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                JdbcUtil.close();
            }
            return num;
        }
}
