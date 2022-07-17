package com.iweb.homework;

public class Test1 {
    public static void main(String[] args) {
        Number number=new Number(10,5);
        int add = number.addition();
        int sub = number.subtration();
        int mul=number.multiplication();
        int div = number.division();
        System.out.println("n1+n2="+add);
        System.out.println("n1-n2="+sub);
        System.out.println("n1*n2="+mul);
        System.out.println("n1/n2="+div);

    }
}
