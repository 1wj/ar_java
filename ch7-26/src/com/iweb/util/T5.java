package com.iweb.util;

import java.util.List;
import java.util.Map;
//测试写的util工具包
public class T5 {
    public static void main(String[] args) {
          String sql="select * from my_user where username=? and password=? ";
        List<Map<String, Object>> list = JdbcUtil.queryBySql(sql, "root", "123456");
        for (Map<String, Object> map:list) {
            System.out.println(map);
        }
        String sql2="insert into my_stu(sid,sname,sage) values(?,?,?)";
        int i = JdbcUtil.updateBySql(sql2, "1002","张三", 20);
        System.out.println("成功输入"+i+"条语句");
    }
}
