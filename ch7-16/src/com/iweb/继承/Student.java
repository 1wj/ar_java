package com.iweb.继承;

public class Student extends Person {
    String school;
    
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    void getInfo(){
        System.out.println("编号："+this.getPno()+",姓名:"+this.getPname()+
                ",年龄"+this.getPage()+"，学校："+getSchool());
    }

}
