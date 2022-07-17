package com.iweb.hm;

public class Test3 {
    public static void main(String[] args) {
        Point p1=new Point(5,0);
        Point p2=new Point(0,0);
        Circle c=new Circle(p2,6);//可以合并  Circle c=new Circle(new Point(0,0),6);
        boolean b = c.panDuan(p1);
        if(b)
            System.out.println("点在圆内");
        else
            System.out.println("点在圆外");
    }


}
