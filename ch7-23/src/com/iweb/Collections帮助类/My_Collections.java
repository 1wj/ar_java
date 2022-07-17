package com.iweb.Collections帮助类;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class My_Collections {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(10);//list里面放的是对象，这里自动装箱了
        list.add(102);
        list.add(100);
        list.add(50);
        Collections.sort(list);
        System.out.println(list);
    }
}
