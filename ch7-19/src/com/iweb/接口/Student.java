package com.iweb.接口;

public class Student implements Signer, Painter {
    @Override
    public void sing() {
        System.out.println("我正在唱歌");
    }

    @Override
    public void point() {
        System.out.println("我正在画画");
    }
}
