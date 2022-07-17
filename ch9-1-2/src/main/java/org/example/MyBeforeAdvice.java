package org.example;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
//切面类 前置通知
public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println(method.getName()+" 方法开始, 输入参数：  "+objects[0]+"  and   "+objects[1]);
    }
}
