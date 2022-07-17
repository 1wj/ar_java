package com.iweb.hw.p4;

public class MyThread2 implements Runnable{
    J j=null;

    public MyThread2() {
    }

    public MyThread2(J j) {
        this.j = j;
    }

    @Override
    public void run() {
        j.sub();
    }
}
