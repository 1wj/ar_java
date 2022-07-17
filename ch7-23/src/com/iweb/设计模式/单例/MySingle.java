package com.iweb.设计模式.单例;
//单例模式之饿汉式
//优点：写法简单，在类加载的时候就完成实例化，避免线程同步。
//缺点：没有达到懒加载的效果，若果自始至终都没有用过这个对象，就会造成内存浪费。
public class MySingle {
    private static final MySingle my=new MySingle();

    private MySingle() {
    }

    public static MySingle getMySingle(){
        return my;
    }

    public void f(){
        System.out.println("我是饿汉式f方法");
    }
}
