package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {
    @Test
    public void test1() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        Arithmetic bean = (Arithmetic) ac.getBean(Arithmetic.class);
       // Arithmetic bean = (Arithmetic) ac.getBean("arithmetic");//都可以使用
        int result=bean.add(3,6);
        System.out.println(result);
        int result2=bean.div(12,6);
        System.out.println(result2);
    }
}
