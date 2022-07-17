package com.iweb;

import java.util.HashMap;
import java.util.Map;
//实例工厂模式
public class InstranceCarFactory {
    private static Map<String,Car> cars;

    public  InstranceCarFactory(){
        cars=new HashMap<>();
        cars.put("audi",new Car("audi","30000","234"));
        cars.put("fute",new Car("fute","40000","234"));
        cars.put("volvo",new Car("volvo","300230","224"));
    }
    public  Car getCars(String brand){
        return cars.get(brand);
    }
}
