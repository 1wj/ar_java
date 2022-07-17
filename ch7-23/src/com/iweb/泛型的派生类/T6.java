package com.iweb.泛型的派生类;

public class T6 {
    public static void main(String[] args) {
        ChldFirst<String> cf=new ChldFirst<>();
        cf.setValue("123");
        String s = cf.getValue();
        System.out.println(s);
    }
}
