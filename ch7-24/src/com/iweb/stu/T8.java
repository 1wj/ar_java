package com.iweb.stu;

import com.iweb.util.JdbcUtil;

public class T8 {
    public static void main(String[] args) {
        String sql="delete from student_77 where sno='1001'";
        int i = JdbcUtil.updateBySql(sql);
        System.out.println("成功修改了"+i+"条记录");

       /* String sql1="insert into student_77 where sno='1001'";
        int i = JdbcUtil.updateBySql(sql);
        System.out.println("成功修改了"+i+"条记录");
*/
    }
}

