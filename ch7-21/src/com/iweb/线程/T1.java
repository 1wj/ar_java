package com.iweb.线程;

public class T1 {
    public static void main(String[] args) {
        TT tt =new TT();//创建一个可运行的对象
        Thread th=new Thread(tt);//将可运行的对象封装成线程对象
        th.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tt.m2();
    }
}
