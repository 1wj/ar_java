package com.iweb.homework2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 4、键盘输入一个int类型的整数，如果录入的其他字符，请提示“对不起，输入数值非法”。
 */
public class T4 {
    public static void main(String[] args) {
        try {
            Scanner sc=new Scanner(System.in);
            int i=sc.nextInt();
            System.out.println(i);
        } catch (InputMismatchException e) {
            System.out.println("对不起请输入整数");
        }
    }

}
