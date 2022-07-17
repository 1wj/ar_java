package com.iweb.hm;

/**
 * 3.创建的新的包,在新的包中按照以下要求编写代码
 * 创建Circle类并添加一个方法，计算一个二维空间的点（Point对象）是否在圆（ Circle对象）内，并写程序验证。
 * ①、写一个Point类，属性：x，y
 * ②、写个Circle类，属性： Point，double（半径）
 * ③、写一个Circle类的方法，该方法接收一个参数（ Point 型），用来判断传进来的点是否在当前Circle内。
 */
public class Circle {
    private Point p;//圆心
    private double bj;
    public boolean panDuan(Point b){
        double x=Math.pow(b.getX()-this.p.getX(),2)+ Math.pow(b.getY()-this.p.getY(),2);
        if(x<=Math.pow(bj,2))
            return true;
        return false;
    }



    public Circle() {
    }

    public Circle(Point p, double bj) {
        this.p = p;
        this.bj = bj;
    }

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public double getBj() {
        return bj;
    }

    public void setBj(double bj) {
        this.bj = bj;
    }
}
