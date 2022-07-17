package com.iweb.super关键字;

public class Father  {
    int value;
    String name;
    int no;
    public  Father(){
        System.out.println("我是父类的构造方法");
    }
    public Father(int value){
        this(value,"张三",1001);
    }

    public Father(int value, String name) {
        this(value,name,2001);
    }

    public Father(int value, String name, int no) {
        this.value = value;
        this.name = name;
        this.no = no;
        System.out.println("我是三个参数构造方法");
    }

    void f(){
        value=100;
        System.out.println("father:"+this.value);
    }

}
