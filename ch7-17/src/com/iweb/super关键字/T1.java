package com.iweb.super关键字;

public class T1 {
    public static void main(String[] args) {
      /*  Child c=new Child();
        c.f();*/
        Father f=new Father(30);
        System.out.println(f.value+","+f.no+","+f.name);
        Father f2=new Father(40,"李四");
        System.out.println(f2.value+","+f2.no+","+f2.name);
        Father f3=new Father(50,"王五",3001);
        System.out.println(f3.value+","+f3.no+","+f3.name);
    }
}





