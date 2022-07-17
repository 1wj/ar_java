package com.iweb.JDBC;

import java.sql.*;

public class myjdbc {
    public static void main(String[] args) {
        Connection conn=null;//表示数据库的连接
        Statement stat=null;//这是用来操作sql语句的对象
        ResultSet rs=null;//这是用来接收查询结果集的对象
        ResultSetMetaData rsmd=null;//用来湖区Result中列信息的对象
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");//加载驱动类
            conn= DriverManager.getConnection("jdbc:oracle:thin:@192.168.77.100:1521:helowin","scott","123456");
            stat=conn.createStatement();//获取一个Statement对象

            String sql="select * from department";
             rs= stat.executeQuery(sql);//执行sql语句
             rsmd=rs.getMetaData();

            while (rs.next()){
                for (int i = 1; i <=rsmd.getColumnCount(); i++) {//获取所有的列数
                    String columnName=rsmd.getColumnName(i);//获取指定列的列名
                    Object o = rs.getObject(i);//获取指定列的值
                    System.out.print(columnName+"="+o+"   ");
                }
                System.out.println();
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if (rs!=null){
                    rs.close();
                }
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
