package com.iweb;

import java.util.HashMap;
import java.util.Map;
//静态工厂类
public class CarFactory {
    private static Map<String,Car> cars=new HashMap<>();

    static {
        cars.put("audi",new Car("audi","30000","234"));
        cars.put("fute",new Car("fute","40000","234"));
        cars.put("volvo",new Car("volvo","300230","224"));
    }
    public static Car getCars(String name){
        return cars.get(name);
    }
}
