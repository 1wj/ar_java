package com.iweb.dept;

public class Department {
    private String dno;
    private String dname;
    private String stucount;

    @Override
    public String toString() {
        return "Department{" +
                "dno='" + dno + '\'' +
                ", dname='" + dname + '\'' +
                ", stucount='" + stucount + '\'' +
                '}';
    }

    public Department(String dno, String dname, String stucount) {
        this.dno = dno;
        this.dname = dname;
        this.stucount = stucount;
    }

}
