package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest 
{

    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Arithmetic arithmetic = (Arithmetic) ac.getBean("arithmetic");
        System.out.println(arithmetic.add(3,9));
        System.out.println(arithmetic.sub(13,9));
        System.out.println(arithmetic.mul(13,9));
        System.out.println(arithmetic.div(27,9));




    }
}
