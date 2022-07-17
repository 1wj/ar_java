package com.iweb.异常处理;

public class T5 {
    public static void main(String[] args) {
        try {
            f();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界");
        }finally {
            System.out.println("hello");
        }
    }
    static void f() throws ArrayIndexOutOfBoundsException{
        int [] arr=new int[2];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        System.out.println(arr[1]);


    }
}
