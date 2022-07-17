package com.iweb;

import org.springframework.beans.factory.FactoryBean;

//实现factoryBean接口
public class SXCarFactory implements FactoryBean<Car> {


    @Override
    public Car getObject() throws Exception {
        return new Car("福特额","234535","180");
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
