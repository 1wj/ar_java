package com.iweb.线程;

public class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是"+Thread.currentThread().getName()+"线程,中"+i);
        }
    }
}
