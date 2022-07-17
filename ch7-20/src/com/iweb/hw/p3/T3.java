package com.iweb.hw.p3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 3、有n顶帽子，每顶帽子的售价是随机整数，
 * 现在编写一段代码，价格从低到高的第三顶帽子的价格是多少
 */
public class T3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入帽子个数：");
        int num = sc.nextInt();
        int []arr=new int[num];
        for (int i = 0; i < num; i++) {
            Integer price = Math.toIntExact(Math.round(Math.random() * 100));
            arr[i]=price;
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >arr.length-4 ; i--) {
            System.out.print(arr[i]+"    ");
        }


    }
}
