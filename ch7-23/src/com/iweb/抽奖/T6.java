package com.iweb.抽奖;

import java.util.ArrayList;
import java.util.List;

public class T6 {
    public static void main(String[] args) {
        //创建一个抽奖器类的对象，指定数据类型
        Prodeuct<Boolean> pro=new Prodeuct();
        List<String> list=new ArrayList<>();
        list.add("苹果手机");
        list.add("扫地机器人");
        list.add("咖啡机");
        //抽奖
        Object prod=pro.getProduct(list);
        System.out.println("恭喜你抽中了"+prod);
        System.out.println("*********************************");
        List<Integer> list2=new ArrayList<>();
        list2.add(12);
        list2.add(23);
        list2.add(10000);
        //抽奖
        Object prod2=pro.getProduct(list2);
        System.out.println("恭喜你抽中了"+prod2);
        System.out.println("*********************************");


        Prodeuct.printtype("jvaa",true,100);

        System.out.println("*********************************");
        Prodeuct.printtype2("jvaa",true,100);

    }
}
