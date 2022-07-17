package com.iweb.泛型;

import java.util.ArrayList;
import java.util.List;
//泛型对象的赋值过程中 泛型没有继承性
public class T10 {
    public static void main(String[] args) {
        List<?> l1=new ArrayList<>();
        List<String> l2=new ArrayList<>();
        l1=l2;
    }
}
