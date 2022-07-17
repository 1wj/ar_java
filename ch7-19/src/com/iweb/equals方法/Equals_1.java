package com.iweb.equals方法;

public class Equals_1 {
    public static void main(String[] args) {
        Cat c1=new Cat(10,20);
        Cat c2=new Cat(10,20);
        System.out.println(c1.equals(null));
        System.out.println(c1.getClass());//全限定类名
        System.out.println(c2.getClass());
    }
}
