package com.iweb.死锁;

public class T2 {
    public static void main(String[] args) {
        TestDeadLock td1=new TestDeadLock();
        TestDeadLock td2=new TestDeadLock();
        td1.setFlag(1);
        td2.setFlag(2);
        Thread t1=new Thread(td1);
        Thread t2=new Thread(td2);
        t1.start();
        t2.start();
    }
}
