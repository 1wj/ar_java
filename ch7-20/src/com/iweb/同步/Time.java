package com.iweb.同步;

public class Time {
    public static int num=0;
     /*synchronized */
     void  add(String str){
         synchronized(this){//锁这个当前对象   //可以试试字符串例如 “abc”
             num++;
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
             System.out.println(str+",你好，你是第"+num+"个访问的线程");
         }

     }

}
