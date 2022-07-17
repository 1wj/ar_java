package com.iweb.设计模式.工厂;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static Map<String,Car> cars=new HashMap<>();

    static {
        cars.put("10001",new Car("10001","audi",240,300000));
        cars.put("10002",new Car("10002","vovol",220,300000));
        cars.put("10003",new Car("10003","ford",210,300000));
        cars.put("10004",new Car("10004","bmw",200,300000));
    }
    public static Car getCar(String id){
        return cars.get(id);
    }
}
