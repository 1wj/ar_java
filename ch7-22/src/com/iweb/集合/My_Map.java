package com.iweb.集合;

import java.util.*;

public class My_Map {
    public static void main(String[] args) {
        Map m1=new HashMap();
        m1.put("one",new Integer(100));
        m1.put("two",new Integer(100));
        m1.put("three",new Integer(200));
        m1.put(null,null);
        System.out.println(m1.size());
        System.out.println(m1.containsKey("one"));
        System.out.println(m1.containsValue(new Integer(100)));

        Integer i = (Integer) m1.get("three");
        System.out.println(i);
        System.out.println( m1.get(null));
        System.out.println( m1);
        System.out.println("-----------------");
        Set<Map.Entry<String,Integer>> set=m1.entrySet();
        Iterator<Map.Entry<String,Integer>> it=set.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry=it.next();
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
