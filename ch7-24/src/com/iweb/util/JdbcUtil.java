package com.iweb.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JdbcUtil {
    static Connection conn=null;//表示数据库的连接
    static Statement state=null;//表示用来操作sql语句的对象
    static ResultSet rs=null;//用来接收查询结果集的对象
    static ResultSetMetaData rsmd=null;//这是一个用来获取ResultSet总列信息的对象
    private static Connection getConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");//加载驱动类
            conn=DriverManager.getConnection("jdbc:oracle:thin:@192.168.77.100:1521:helowin","scott","123456");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }
    /**
     * 关闭资源
     */
    private static void closeJdbc() throws SQLException {
        if(rs!=null)
            rs.close();
        if(conn!=null)
            conn.close();
        if(state!=null)
            state.close();
    }

    /**
     * 查询方法
     */
    public static synchronized List<Map<String,Object>> queryBySql(String sql){
        List<Map<String,Object>> list=new ArrayList<>();
        try {
            conn=getConnection();
            state=conn.createStatement();
            rs=state.executeQuery(sql);
            rsmd=rs.getMetaData();
            while (rs.next()){
                Map<String,Object> map=new HashMap<>();
                for (int i = 1; i <=rsmd.getColumnCount(); i++) {
                    map.put(rsmd.getColumnName(i),rs.getObject(i));
                }
                list.add(map);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                closeJdbc();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return list;
    }
    /**
     * 增删改
     */
        public synchronized static int updateBySql(String sql){
            int i=0;
            try {
                state=getConnection().createStatement();
                 i= state.executeUpdate(sql);

            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }finally {
                try {
                    closeJdbc();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            return i;
        }

}
