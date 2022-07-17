package com.iweb.接口;

public class T2 {
    public static void main(String[] args) {

        Signer signer=new Student();
        signer.sing();

        Painter stu=(Painter) signer;
        stu.point();

    }
}
