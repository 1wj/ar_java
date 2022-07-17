package com.iweb.类存储器;
//静态关键字static
public class Static_cat {
    static int sid;  //静态变量可以放在构造方法中计数
    int id;
    String name;

    public Static_cat() {
        this.sid++;
    }

    public Static_cat(String name) {
        this.id=sid++;
        this.name = name;
    }
    void info(){
        //sid++;//普通方法可以修改静态变量？
        System.out.println("my name is "+this.name+"my id is "+id);
    }
    static void f(){
        System.out.println("我是静态方法");
    }


    public static void main(String[] args) {
        Static_cat.sid=100;
        Static_cat sc=new Static_cat("tom");
        sc.info();
        Static_cat sc2=new Static_cat("jorry");
        sc2.info();
    }
}
