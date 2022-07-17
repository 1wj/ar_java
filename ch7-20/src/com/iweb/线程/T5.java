package com.iweb.线程;
//实现runnable接口的创建
public class T5 {
    public static void main(String[] args) {
        MyThread2 mt2=new MyThread2();
        Thread th=new Thread(mt2);
        th.setName("t2");
        th.start();

        try {
            th.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 1000; i++) {
            System.out.println("我是main"+i);
        }
    }
}
