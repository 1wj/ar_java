package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class TestAspect {
    @Before(value = "execution(* org.example.Arithmetic.*(..))")
    public void beforeMethod(JoinPoint joinPoint){
        String name= joinPoint.getSignature().getName();
        Object[]args= joinPoint.getArgs();
        System.out.println("方法名为 ：" +name+"参数："+args[0]+" and "+args[1]);
    }
}
