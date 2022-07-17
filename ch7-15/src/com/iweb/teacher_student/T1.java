package com.iweb.teacher_student;

public class T1 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher();
        teacher.age=30;
        teacher.tname="张三";
        teacher.tno= "01";

        Student s=new Student();
        s.sname="李四";
        s.sno="11";

        teacher.teacher(s);
    }
}
