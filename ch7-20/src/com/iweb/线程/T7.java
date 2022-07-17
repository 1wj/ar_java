package com.iweb.线程;
//暂停当前正在执行的线程对象
public class T7 {
    public static void main(String[] args) {
        MyThread4 mt4=new MyThread4();
        MyThread4 mt402=new MyThread4();
        Thread th=new Thread(mt4);
        Thread th2=new Thread(mt402);
        th.setName("t1");
        th2.setName("t2");
        th.setPriority(7);
        th2.setPriority(4);
        th.start();
        th2.start();
    }
}
