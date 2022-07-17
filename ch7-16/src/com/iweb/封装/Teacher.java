package com.iweb.封装;

//一个封装类
public class Teacher {
    private String tno;
    private String name;
    private int tage;

    public Teacher() {
    }

    public Teacher(String tno, String name, int tage) {
        this.tno = tno;
        this.name = name;
        this.tage = tage;
    }

    public String getTno() {
        return tno;
    }

    public void setTno(String tno) {
        this.tno = tno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTage() {
        return tage;
    }

    public void setTage(int tage) {
        this.tage = tage;
    }
}
