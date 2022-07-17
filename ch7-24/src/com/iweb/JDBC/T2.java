package com.iweb.JDBC;

import java.sql.*;
//插入
public class T2 {
        public static void main(String[] args) {
            Connection conn=null;//表示数据库的连接
            Statement stat=null;//这是用来操作sql语句的对象
            int i=0;//这是用来接收查询结果集的对象
            ResultSetMetaData rsmd=null;//用来湖区Result中列信息的对象
            try {
                Class.forName("oracle.jdbc.driver.OracleDriver");//加载驱动类
                conn= DriverManager.getConnection("jdbc:oracle:thin:@192.168.77.100:1521:helowin","scott","123456");
                stat=conn.createStatement();//获取一个Statement对象

                String sql="insert into department(dno,dname,stucount) values('7','集成电路','20')";
                i= stat.executeUpdate(sql);//执行sql语句
                System.out.println("成功新增了"+i+"条记录");



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

