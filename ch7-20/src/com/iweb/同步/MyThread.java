package com.iweb.同步;

public class MyThread implements Runnable{
    Time time=null;

    public MyThread(){
        time=new Time();
    }
    @Override
    public void run() {

        time.add(Thread.currentThread().getName());
    }
}
