package com.iweb.同步;
//测试线程不加锁会发生什么
public class T1 {
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        MyThread mt2=new MyThread();
        Thread th1=new Thread(mt);
      //  Thread th2=new Thread(mt);
       Thread th2=new Thread(mt2);

        th1.setName("t1");
        th2.setName("t2");
        th1.start();
        th2.start();

    }
}
