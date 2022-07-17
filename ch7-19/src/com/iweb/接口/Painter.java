package com.iweb.接口;

public interface Painter {
    void point();
    //1.8后的新特性 用static 或default 修饰普通方法
     static void g(){};
     default void s(){};
}
