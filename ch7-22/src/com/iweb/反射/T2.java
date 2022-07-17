package com.iweb.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class T2 {
    public static void main(String[] args) {
        Class<Person> clazz=Person.class;
        try {
            Person p = clazz.newInstance();//实例化一个新对象
            System.out.println(p);

            Field f1= clazz.getField("pname");
            f1.set(p,"张三");

            System.out.println(p);

            Field f2=clazz.getDeclaredField("pno");
            f2.setAccessible(true);
            f2.set(p,"110");
            System.out.println(p);

            Field f3=clazz.getDeclaredField("page");
            f3.setAccessible(true);
            f3.set(p,35);
            System.out.println(p);

            //方法
            Method m1 = clazz.getDeclaredMethod("show");
            m1.invoke(p);
            Method m2=clazz.getDeclaredMethod("display", String.class);
            m2.invoke(p,"中国");

            //获得所有的属性
            Field[] fs = clazz.getDeclaredFields();
            System.out.println(fs.length);
            for (Field f:fs){
                System.out.println("所有的属性"+f);
            }
            //获取所有的方法
            Method[] ms1=clazz.getMethods();
            System.out.println(ms1.length);
            for (Method m : ms1) {
                System.out.println("所有public方法"+m);
            }
            System.out.println("-----------------------------------------------");
            Method[] ms2=clazz.getDeclaredMethods();
            System.out.println(ms2.length);
            for (Method m : ms2) {
                System.out.println("所有的方法"+m);
            }
            System.out.println("-----------------------------------------------");
            //构造方法
            Constructor[] c1 = clazz.getConstructors();
            System.out.println(c1.length);
            for (Constructor c : c1) {
                System.out.println("构造方法："+c);
            }
            System.out.println("-----------------------------------------------");
            Constructor[] c2=clazz.getDeclaredConstructors();
            System.out.println(c2.length);
            for (Constructor c : c2) {
                System.out.println("所有的构造方法："+c);
            }
            System.out.println("-----------------------------------------------");
            Constructor<Person> c3 = clazz.getDeclaredConstructor(null);
            System.out.println("无参的构造方法"+c3);
            System.out.println("无参的构造方法"+c3.getName());

            System.out.println("-----------------------------------------------");
            Constructor<Person> c4 = clazz.getDeclaredConstructor(String.class,String.class,int.class);
            System.out.println("有参的构造方法"+c4);
            System.out.println("有参的构造方法"+c4.getName());

            //利用反射出的构造方法对象创建Person对象
            Person p2=c4.newInstance("1002","李四",45);
            System.out.println(p2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
