package com.iweb.设计模式.单例;

public class test12 {
    public static void main(String[] args) {
        MySingle2 ms = MySingle2.getMs();
        MySingle2 ms2 = MySingle2.getMs();
        System.out.println(ms==ms2);
        ms.f();
    }
}
