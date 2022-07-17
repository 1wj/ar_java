package com.iweb.抽奖;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//一个抽奖系统

public class Prodeuct <T>{
    //奖品用来接着集合中get出来的值
    private T product;
    //奖品池
    List<T> list=new ArrayList<>();
    Random random=new Random();

    //添加奖品
    public void addPro(T t){
        list.add(t);
    }

    //抽奖
    public T getPro(){
        product=list.get(random.nextInt(list.size()));
        return product;
    }

    public <E> E getProduct(List<E> list){
        return list.get(random.nextInt(list.size()));
    }

    public static <T,E,K> void printtype(T t,E e,K k){
        System.out.println(t+"----"+t.getClass().getSimpleName());
        System.out.println(e+"----"+e.getClass().getSimpleName());
        System.out.println(k+"----"+k.getClass().getSimpleName());
    }

    public static <E> void printtype2(E ... e){
        System.out.println("您一共传进来了"+e.length+"个参数");
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
