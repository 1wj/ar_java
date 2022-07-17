package com.iweb.dept;

import com.iweb.util.JdbcUtil;

public class T7 {
    public static void main(String[] args) {
        String sql="update department set dname='小红系' where dno='2'";
        int i = JdbcUtil.updateBySql(sql);
        System.out.println("成功修改了"+i+"条记录");
    }
}
