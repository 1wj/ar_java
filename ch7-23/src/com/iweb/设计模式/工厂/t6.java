package com.iweb.设计模式.工厂;

public class t6 {
    public static void main(String[] args) {
        Car car=CarFactory.getCar("10001");
        System.out.println(car);
    }
}
