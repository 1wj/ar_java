package com.iweb.反射;

import java.util.Objects;

public class Person {
    private String pno;
    public String pname;
    private int page;

     Person() {
        System.out.println("我是无餐构造方法");
    }

    public Person(String pno, String pname, int page) {
        this.pno = pno;
        this.pname = pname;
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return page == person.page && Objects.equals(pno, person.pno) && Objects.equals(pname, person.pname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pno, pname, page);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pno='" + pno + '\'' +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                '}';
    }
      void show(){
        System.out.println("我是shou方法");
    }
    public void display(String name){
        System.out.println("我是一个人"+name);
    }
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
