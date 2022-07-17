package com.iweb.线程;

public class T4 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        mt.start();
        for (int i = 0; i < 2000; i++) {
            System.out.println("我是main"+i);
        }
    }

}
