package com.iweb.homework;

import java.util.Arrays;
import java.util.Scanner;

public class H1 {
    public static void main(String[] args) {
        //1、从键盘输入10个整数，存放进一个数组，输出该数组，并输出该数组中的最大数、第二大数。
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入10个数");
        int [] arr=new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >arr.length-3 ; i--) {
            System.out.print(arr[i]+"   ");
        }
    }
}
