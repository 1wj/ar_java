package com.iweb.集合;

import com.iweb.反射.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class My_Set {
    public static void main(String[] args) {
        Set set1=new HashSet();
        set1.add(new Person("1001","张三",20));
        set1.add(new Person("1001","张三",20));
        set1.add(new Integer(100));
        set1.add(new Integer(100));
        set1.add("hello");
        set1.add("hello");
        System.out.println(set1.size());
        System.out.println(set1);

        Set set2=new HashSet();
        set2.add("hello");
        set2.add(new Person("1002","张三",20));

       // set1.retainAll(set2);
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println("------------------");
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }

}
