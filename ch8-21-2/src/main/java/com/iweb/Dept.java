package com.iweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dept {
    private int dno;
    private int dname;
    private int dcount;

    public Dept() {
    }

    public Dept(int dno, int dname, int dcount) {
        this.dno = dno;
        this.dname = dname;
        this.dcount = dcount;
        System.out.println("我是有参的构造方法");
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno=" + dno +
                ", dname=" + dname +
                ", dcount=" + dcount +
                '}';
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }

    public int getDname() {
        return dname;
    }

    public void setDname(int dname) {
        this.dname = dname;
    }

    public int getDcount() {
        return dcount;
    }

    public void setDcount(int dcount) {
        this.dcount = dcount;
    }
}
