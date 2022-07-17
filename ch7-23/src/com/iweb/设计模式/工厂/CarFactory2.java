package com.iweb.设计模式.工厂;

import com.iweb.设计模式.代理.CarSale;

import java.util.HashMap;
import java.util.Map;
//实例工厂模式
public class CarFactory2 implements CarSale {
    private Map<String,Car> cars=new HashMap<>();
    public CarFactory2(){
        cars.put("10001",new Car("10001","audi",240,300000));
        cars.put("10002",new Car("10002","vovol",220,300000));
        cars.put("10003",new Car("10003","ford",210,300000));
        cars.put("10004",new Car("10004","bmw",200,300000));

    }
    public Car getCar(String id){
        return cars.get(id);
    }

    @Override
    public void sale() {
        System.out.println("工厂在卖车");
    }
}
