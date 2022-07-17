package com.iweb.继承;

public class T1 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setPage("20");
        s1.setPname("张三");
        s1.setPno("1010");
        s1.setSchool("南信大");
        /*s1.height=180.2;
        s1.weight=78.2;
        System.out.println(s1.pno +s1.pname+ s1.page +s1.school+s1.height+s1.weight);*/
        Person p=new Person("2014","任然","50");
        p.getInfo();
        s1.getInfo();
    }
}
