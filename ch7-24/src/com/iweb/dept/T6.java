package com.iweb.dept;

import com.iweb.stu.Student;
import com.iweb.util.JdbcUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class T6 {
    public static void main(String[] args) {
        String sql="select * from department ";
        List<Map<String,Object>> list= JdbcUtil.queryBySql(sql);
        List<Department> stulist=new ArrayList<>();
        for (Map<String,Object> map:list) {
            String cno = (String) map.get("DNO");
            String cname = (String) map.get("DNAME");
            String stu = (String) map.get("STUCOUNT");
            Department de=new Department(cno,cname,stu);
            stulist.add(de);
        }
        System.out.println(stulist);

    }
}
