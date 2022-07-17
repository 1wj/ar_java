package com.iweb;
//protected 出了包 只能在子类中使用
import com.iweb.访问控制符.T;

public class T3 extends T {
    void c(){
        T t=new T();
       // t.i1;
      //  t.i2;
        i3=100;
        t.i4=100;
    }
}
