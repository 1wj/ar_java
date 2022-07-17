package com.iweb.死锁;

public class TestDeadLock implements Runnable{
    static private Object o1=new Object();
    static private Object o2=new Object();
    private int flag;

    public void setFlag(int flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if(flag==1){
            synchronized(this){//o1
                System.out.println("我是flag1 ，我正在工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
               // synchronized (o2){
                    System.out.println("我是flag1，我的工作结束了");
                //}
            }
        }else{
            synchronized(this){//o2
                System.out.println("我是flag2 ，我正在工作");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //synchronized (o1){
                    System.out.println("我是flag2，我的工作结束了");
                //}
            }
        }

    }
}
