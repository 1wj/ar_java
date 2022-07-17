package com.iweb.线程;

public class MyThread extends Thread {

    public  void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("      a中"+i);
        }
    }
}
