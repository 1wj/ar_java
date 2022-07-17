package com.iweb.封装;


public class Test1 {
    public static void main(String[] args) {
        Teacher t=new Teacher();
        t.setName("张三");
        t.setTage(20);
        t.setTno("1001");
        System.out.println(t.getName()+t.getTno()+t.getTage());
    }
}
