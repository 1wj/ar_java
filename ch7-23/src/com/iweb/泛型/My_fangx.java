package com.iweb.泛型;

import java.util.*;

public class My_fangx {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("abc");
        list.add("123");
        System.out.println(list);

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String next = it.next();
            System.out.println(next);
        }
        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        System.out.println(map);


    }




}
