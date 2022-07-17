package com.iweb;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void tt(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("factoryCar.xml");
      //静态工厂模式
        //Car car= (Car) ac.getBean("car1");
        //实例工厂模式
        //Car car2= (Car) ac.getBean("car2");
        //spring独有的实现FactoryBean<E>工厂模式
        Car car2= (Car) ac.getBean("sxCarFactory");
        System.out.println(car2);
    }
    @Test
    public void tt2(){
       // String a="ass";
        String d=new String("ass");
       int a=3;
        System.out.println((- -a )<< a);
    }
}
