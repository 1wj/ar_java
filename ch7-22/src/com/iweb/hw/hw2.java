package com.iweb.hw;

import java.text.DateFormat;
import java.util.*;

/**
 * 2、给定数组int[] arr = new int[] { 100, 60, 20, 30, 20, 10, 50, 60, 90 ,40};
 * 要求:对其排重并排序
 */
public class hw2 {
    public static void main(String[] args) {
        Set set=new HashSet();//可以考虑treeset自带排序和去重
        int [] arr=new int[]{100, 60, 20, 30, 20, 10, 50, 60, 90 ,40};
        for (int i:arr){
            set.add(i);
        }
        Object[] arr2 = set.toArray();
        Arrays.sort(arr2);
        for (Object o :arr2 ){
            System.out.print(o+"   ");
        }
        System.out.println();

        Set set1=new HashSet();
        List list=new ArrayList<>(set1);



    }
}
