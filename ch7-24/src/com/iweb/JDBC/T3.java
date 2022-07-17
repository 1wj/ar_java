package com.iweb.JDBC;

import java.sql.*;

//调用存储过程
public class T3 {
    public static void main(String[] args) {
        Connection conn=null;//表示数据库的连接
       CallableStatement stat=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");//加载驱动类
            conn= DriverManager.getConnection("jdbc:oracle:thin:@192.168.77.100:1521:helowin","scott","123456");
            stat=conn.prepareCall("{call testjdbc0724(?,?,?) }");//获取一个Statement对象
            stat.setString(1,"8");
            stat.setString(2,"电竞");
            stat.setString(3,"500");
            stat.execute();
            System.out.println("成功调用了一个存储过程");





        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {

                if(stat!=null){
                    stat.close();
                }
                if (conn!=null){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
