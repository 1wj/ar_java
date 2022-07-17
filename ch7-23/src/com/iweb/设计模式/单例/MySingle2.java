package com.iweb.设计模式.单例;
//单例模式之懒汉式
// 当程序第一次访问单例模式实例时才进行创建（延迟加载）。
// 缺点：只能在单线程下使用，多线程下会产生多个对象。
public class MySingle2 {

    private static MySingle2 ms= null;

    private MySingle2() {
    }

    public static MySingle2 getMs() {
        if(ms==null)
            ms=new MySingle2();
        return ms;
    }


    /**著名的双重检查机制(推荐)
     * public static Singleton3 getInstance() {
     * 	   if(singleton==null) {
     *
     * 		   synchronized (Singleton3.class) {
     * 			if(singleton==null) {
     * 				singleton=new Singleton3();
     *                        }* 		}
     *       }
     *
     * 	   return singleton;
     *    }
     */

    public void f(){
        System.out.println("我是懒汉式f方法");
    }
}
