package com.iweb.stu;

public class Student {
    private String sno;
    private String sname;
    private  Integer sage;
    private  String cno;

    public Student() {
    }

    public Student(String sno, String sname, Integer sage, String cno) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.cno = cno;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sno='" + sno + '\'' +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", cno='" + cno + '\'' +
                '}';
    }
}
