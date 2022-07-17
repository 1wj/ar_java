package com.iweb.线程;

public class TT implements Runnable{
    private int num=100;

    public synchronized void m1(){
        num=1000;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我是m1方法，num=="+num);
    }
    public synchronized void m2(){
        num=2000;
        System.out.println("我是m2方法，num=="+num);
    }
    @Override
    public void run() {
        m1();
    }
}
