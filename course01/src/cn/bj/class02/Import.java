package cn.bj.class02;

import java.util.Scanner;

public class Import {
    public static void main(String[] args) {
//        System.out.println(123);
//        System.err.println(123);
        //键盘录入
        //导入一个工具类
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个数字");
        //录入数字
        int i=sc.nextInt();
        System.out.println(i);
        //录入字符串   next以空格和回车结束
//        String ne=sc.next();
//        System.out.println(ne);
        //录入一行
        String s = sc.nextLine();
        System.out.println(s);
        sc.close();
    }
}
