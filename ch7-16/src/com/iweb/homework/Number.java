package com.iweb.homework;

/**
 * 1、编写Java程序，模拟简单的计算器。
 * 定义名为Number的类，其中有两个整型数据成员n1和n2，应声明为私有。编写构造方法，赋予n1和n2初始值，
 * 再为该类定义加（addition）、减（subtration）、乘（multiplication）、除（division）等公有成员方法，
 * 分别对两个成员变量执行加、减、乘、除的运算。
 * 在main方法中创建Number类的对象，调用各个方法，并显示计算结果。
 */
public class Number {

    private int n1;
    private int n2;

    public Number() {
    }

    public Number(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int addition(){
        return this.n1+this.n2;
    }
    public int subtration(){
        return this.n1-this.n2;
    }
    public int multiplication(){
        return this.n1*this.n2;
    }
    public int division(){
        return this.n1/this.n2;
    }

}
