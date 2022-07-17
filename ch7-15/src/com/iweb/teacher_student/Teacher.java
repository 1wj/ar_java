package com.iweb.teacher_student;

public class Teacher {
    String tno;
    String tname;
    int age;
    void teacher( Student student){
        System.out.println("我是"+tno+"老师，我今年"+age+"岁了，我正在教"+student.sname+"学生");
        student.findWord();
    }
}
