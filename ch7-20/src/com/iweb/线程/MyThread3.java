package com.iweb.线程;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class MyThread3 implements Runnable{
    @Override
    public void run() {
        //设计一个单独的日期格式
        SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        while (true){
            try {
                                 //调用format方法来创建一个日期格式的日期
                System.out.println("-------"+s.format(new Date()) +"-------");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               return;
            }
        }
    }
}
