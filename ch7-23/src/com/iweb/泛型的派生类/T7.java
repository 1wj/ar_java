package com.iweb.泛型的派生类;

public class T7 {
    public static void main(String[] args) {
        ChildSecond cs=new ChildSecond();
        cs.setValue(100);
        Integer i = cs.getValue();
        System.out.println(i);
    }
}
