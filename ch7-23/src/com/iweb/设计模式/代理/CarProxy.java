package com.iweb.设计模式.代理;

import com.iweb.设计模式.工厂.CarFactory2;

public class CarProxy implements CarSale{

    CarFactory2 c2=new CarFactory2();
    @Override
    public void sale() {
        System.out.println("我是4S店");
        System.out.println("帮忙上牌");
        System.out.println("帮忙上保险");
        c2.sale();
        System.out.println("帮忙做售后");
    }

}
