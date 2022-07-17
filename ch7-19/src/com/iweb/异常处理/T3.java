package com.iweb.异常处理;

import com.iweb.抽象类.A;

public class T3 {
    public static void main(String[] args) {
        int i=100,j=0;
        try {
           div(i,j);
        } catch (ArithmeticException e) {
            System.out.println("对不起，除数不能为0");
        }

    }
    static void div(int i,int j) throws ArithmeticException{
        if(j==0)
            throw new ArithmeticException();
        System.out.println(i/j);
    }
}
