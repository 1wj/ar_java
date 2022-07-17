package com.iweb.hw.p4;

public class T4 {
    public static void main(String[] args) {
        J j=new J(5);
        //创建一个可运行的对象
        MyThread mt1 =new MyThread(j);
        MyThread mt2 =new MyThread(j);
        MyThread2 mt3 =new MyThread2(j);
        MyThread2 mt4 =new MyThread2(j);
        //将可运行的对象封装成线程对象
        Thread t1=new Thread(mt1);
        Thread t2=new Thread(mt2);
        Thread t3=new Thread(mt3);
        Thread t4=new Thread(mt4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
