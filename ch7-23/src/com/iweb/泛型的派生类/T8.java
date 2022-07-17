package com.iweb.泛型的派生类;

public class T8 {
    public static void main(String[] args) {
        MyInterFcace<String> mf=new MyInterFaceImpl();
        String  s=mf.getValue();
        System.out.println(s);
    }
}
