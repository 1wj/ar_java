package com.iweb.访问控制符;
//同一个包中四个访问控制符的区别
public class T2 {
    void b(){
        T t=new T();
       // t.i1=100;
        t.i2=100;
        t.i3=100;
        t.i4=100;
    }
}
