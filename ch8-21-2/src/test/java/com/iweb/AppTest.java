package com.iweb;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student stu = (Student) ac.getBean("stu");
       // Student stu = (Student) ac.getBean(Student.class);

        System.out.println(stu);
    }
}
