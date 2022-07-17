package com.iweb.homework;

/**
 * 2.定义一个“点”（Point）类用来表示三维空间中的点（有三个坐标）。要求如下：
 * ①、可以生成具有特定坐标的点的对象。
 * ②、提供可以设置三个坐标的方法。
 * ③、提供可以计算该“点”距原点距离平方的方法。
 * ④、编写程序验证上述三条。
 */
public class Point {
    private double x;
    private double y;
    private double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    public double distance(){
        return  Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2);
    }
}
