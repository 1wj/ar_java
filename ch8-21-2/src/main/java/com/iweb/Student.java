package com.iweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
    @Value("1002")
    private String id;
    @Value("12")
    private String age;
    @Value("张武")
    private String name;
    @Autowired
    private Dept dept;
    public Student() {
        System.out.println("我是student的无参构造");
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", age='" + age + '\'' +
                ", name='" + name + '\'' +
                ", dept=" + dept +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        System.out.println("我是setId方法");
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        System.out.println("我是setAge方法");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("我是setName方法");
    }
}
