package com.iweb.homework;

public class Test4 {
    public static void main(String[] args) {
        Rectangle re=new Rectangle(4,5);
        int area = re.getArea();
        int len=re.getSum();
        System.out.println("周长："+len+",面积："+area);
    }
}
