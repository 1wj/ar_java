package com.iweb.线程;
//打断正在执行的线程
public class T6 {
    public static void main(String[] args) {
        MyThread3 mt3=new MyThread3();
        Thread th=new Thread(mt3);
        th.start();
        try {
            Thread.sleep(2000);
            th.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
