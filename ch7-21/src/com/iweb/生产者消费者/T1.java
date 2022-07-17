package com.iweb.生产者消费者;

public class T1 {
    public static void main(String[] args) {
        ManTouStack mts=new ManTouStack();

        Producer p=new Producer(mts,"张师傅");
        Producer p2=new Producer(mts,"许师傅");
        Thread t1=new Thread(p);
        Thread t2=new Thread(p2);

        Consuer c=new Consuer(mts,"许同学");
        Consuer c2=new Consuer(mts,"周同学");
        Consuer c3=new Consuer(mts,"同学3");
        Consuer c4=new Consuer(mts,"同学4");
        Thread t3=new Thread(c);
        Thread t4=new Thread(c2);
        Thread t5=new Thread(c3);
        Thread t6=new Thread(c4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }

}
