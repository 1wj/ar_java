package com.iweb.hw.p4;

/**
 * 4、编写一段代码，实现4个线程，两个线程对j加1， 两个线程实现对j减1
 */
public class J {
    private int j;

    public J() {
    }

    public J(int j) {
        this.j = j;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public void add(){
        synchronized (this){
            j++;
            System.out.println("对j加法之后的值"+j);
        }

    }
    public void sub(){
        synchronized (this){
            //只要是共享的对象就行了 如果有成员变量 Object Obj=newObject() obj也行
            //的是那几个线程所共享的对象就行
            j--;
            System.out.println("对j减法之后的值"+j);
        }

    }
}
