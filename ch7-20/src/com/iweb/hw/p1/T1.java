package com.iweb.hw.p1;

/**
 * (4).	在main()方法中制造Manager和Employee对象,并测试这些对象的方法
 */
public class T1 {
    public static void main(String[] args) {
        Role role=new Manager("李四",45,"女",10000);
        Role role1=new Employee("张三",25,"男",5000);
        fangfa(role);
        fangfa(role1);
    }
    static void fangfa(Role r){
        if(r instanceof Manager){
            ((Manager)r).getCar();
            ((Manager)r).play();

        }
       else if(r instanceof Employee){
            ((Employee)r).sing();
            ((Employee)r).play();
        }

    }
}
