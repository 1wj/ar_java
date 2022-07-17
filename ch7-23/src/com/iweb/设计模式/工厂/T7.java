package com.iweb.设计模式.工厂;

public class T7 {
    public static void main(String[] args) {
        CarFactory2 c2=new CarFactory2();
        Car car=c2.getCar("10002");
        System.out.println(car);

    }
}
