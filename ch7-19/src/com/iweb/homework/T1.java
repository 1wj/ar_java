package com.iweb.homework;

public class T1 {
    public static void main(String[] args) {
        MyDate myDate=new MyDate(1912,10,12);
        MyDate myDate1=new MyDate(1912,10,12);
        boolean equals = myDate.equals(myDate1);
        if(equals){
            System.out.println("日期相同");
        }else {
            System.out.println("日期不同");
        }
    }
}
