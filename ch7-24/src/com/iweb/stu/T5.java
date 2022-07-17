package com.iweb.stu;

import com.iweb.util.JdbcUtil;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class T5 {
    public static void main(String[] args) {
        String sql="select * from student_77 ";
        List<Map<String,Object>> list= JdbcUtil.queryBySql(sql);
        List<Student> stulist=new ArrayList<>();
        for (Map<String,Object> map:list) {
            String sno = (String) map.get("SNO");
            String sname = (String) map.get("SNAME");
            Integer sage = ((BigDecimal) map.get("SAGE")).intValue();
            String cno = (String) map.get("CNO");
            Student student=new Student(sno,sname,sage,cno);
            stulist.add(student);
        }
        System.out.println(stulist);

    }
}
