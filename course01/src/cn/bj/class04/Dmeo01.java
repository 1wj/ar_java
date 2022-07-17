package cn.bj.class04;

import com.sun.org.apache.bcel.internal.generic.LoadClass;

public class Dmeo01 {
    public static void main(String[] args) {
        //继承： 在java中类的继承是单继承
        new Dog().sleep();
        new Cat().play();



      // LoadClass;
       // ClassLoader   1
       // BootstrapClassLoader 顶级类加载器
        /**
         * 加载子类时先加载父类  ClassLoader 356 401
         * 若子类中有静态代码块 先加载静态代码块 然后加载父类
         * 双亲委派机制
         * 1. 效率
         * 2. 安全
         */
    }
}
class   Animal {
        String name;
        private  int age;

        /**
         * 方法重写  ：
         *   override  用于父子类
         *   与方法重载不一样
         *  对父类的补充和增强
         */
        public void eat(){
            System.out.println("吃");
        }
}
class Cat extends Animal {
    String name;
    int  age;
    public void play(){
        System.out.println("猫在玩");
    }
}
class Dog extends Animal{
    private String name;
    private int age;
    public void sleep(){
        System.out.println("狗会睡觉");
    }
    public  void eat(){
        System.out.println("狗吃骨头");
    }
}
