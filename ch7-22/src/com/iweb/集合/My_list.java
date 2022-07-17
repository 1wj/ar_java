package com.iweb.集合;

import com.iweb.反射.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//list集合
public class My_list {
    public static void main(String[] args) {
        List list=new ArrayList();
        //Person p1=new Person("1001","张三",20);
        list.add(new Person("1001","张三",20));
        list.add(new Integer(100));
        list.add("hello");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        System.out.println(list.size());
        /*list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println("-----------------------------------------");

        System.out.println( list.contains("hello"));
        System.out.println( list.contains(new Person("1001","张三",20)));

        list.remove(new Person("1001","张三",20));
        for (Object o:list) {
            System.out.println(o);
        }

        //使用迭代器iterator遍历
        Iterator it=list.iterator();
        while (it.hasNext()){
            Object o=it.next();
            System.out.println(o);
        }

    }


}
