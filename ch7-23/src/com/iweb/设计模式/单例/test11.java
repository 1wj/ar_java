package com.iweb.设计模式.单例;

public class test11 {
    public static void main(String[] args) {
        MySingle my1 = MySingle.getMySingle();
        MySingle my12 = MySingle.getMySingle();
        MySingle my2 = MySingle.getMySingle();
        System.out.println(my2==my12);
        my1.f();
    }
}
