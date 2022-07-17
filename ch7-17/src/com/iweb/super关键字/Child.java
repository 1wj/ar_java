package com.iweb.super关键字;

public class Child extends Father {
    int value;
    public  Child(){
        System.out.println("我是子类的构造方法");
    }
    void f(){
        super.f();
        value=200;
        System.out.println("child:父类的value值："+super.value);
        System.out.println("child:子类的value值："+this.value);
    }
}
