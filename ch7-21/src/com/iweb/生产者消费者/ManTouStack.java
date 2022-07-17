package com.iweb.生产者消费者;

/**
 * 馒头框
 */
//既有互斥锁又有同步
public class ManTouStack {
    int index=0;//当前框中的馒头数
    ManTou[] arr=new ManTou[6];//模拟一个馒头框
    int count=0;
    /**
     * 生产的方法
     */
    public synchronized void push(ManTou mt,String name){
        while (index== arr.length){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //即将开始扔一个馒头进去
        notify();
        arr[index++]=mt;
        System.out.println(name+"生产了馒头："+mt+",当前馒头数"+(++count));

    }
    /**
     * 消费的方法
     */
    public synchronized ManTou pop(String name){
        while (index==0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //开始拿馒头
        notify();
        index--;
        System.out.println(name+"消费了馒头:"+arr[index]+",当前馒头数"+(--count));
        return arr[index];
    }
}
