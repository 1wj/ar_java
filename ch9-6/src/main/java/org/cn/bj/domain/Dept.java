package org.cn.bj.domain;

import java.util.List;

public class Dept {
    private String dno;
    private String dname;
    private String dstucount;
    private List<Teacher> teachers;

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDstucount() {
        return dstucount;
    }

    public void setDstucount(String dstucount) {
        this.dstucount = dstucount;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dno='" + dno + '\'' +
                ", dname='" + dname + '\'' +
                ", dstucount='" + dstucount + '\'' +
                '}';
    }
}
