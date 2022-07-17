package com.iweb.继承;

public class Person extends Animal {
    private String pno;
    private String pname;
    private String page;

    public Person() {
    }

    public Person(String pno, String pname, String page) {
        this.pno = pno;
        this.pname = pname;
        this.page = page;
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

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }
    void getInfo(){
        System.out.println("编号："+this.pno+",姓名:"+this.pname+",年龄"+this.page);
    }
}
