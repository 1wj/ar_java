package com.iweb.homework;

public class Test2 {
    public static void main(String[] args) {
        Point p=new Point(1,2,3.1);
        double distance = p.distance();
        System.out.println("该点距离原点的距离的平方="+distance);
    }
}
