package com.iweb.hw.p4;

//这还不是一个线程类，是一个可运行的类，它还不是一个线程
public class MyThread implements Runnable{
    J j;

    public MyThread(J j) {
        this.j = j;
    }

    public MyThread() {
    }

    @Override
    public void run() {
        j.add();
    }
}
