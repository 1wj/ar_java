package com.iweb.String类;

import com.iweb.equals方法.Cat;

import java.util.Locale;

public class MyString {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        System.out.println(s1==s2);
        String s3="he"+"llo";
        System.out.println("使用new --------------------------------");
        String s4=new String("hello");
        System.out.println(s1==s4);//false
        System.out.println("==与equals区别--------------------------------");
        System.out.println(s1.equals(s4));//true

        char[] chars=new char[]{'h','e','l','l','o'};
        String s5=new String(chars);

        System.out.println("使用new（char[]）--------------------------------");
        System.out.println(s4.equals(s5));//true

        System.out.println(s4.charAt(1));
        System.out.println(s4.length());

        System.out.println(s5.contains("lo"));
        String s6="HelL0";
        System.out.println(s5.equalsIgnoreCase("hElLo"));
        String s7="gsgdeg";
        System.out.println(s7.indexOf("d",4));
        String s8="";
        System.out.println(s8.isEmpty());
        String s9=null;
       // System.out.println(s9.isEmpty());
        String s10=s7.replace("g","G");
        System.out.println(s10);
        String s11="java,c,c++";
        String[] arr = s11.split(",");
        for (String i:arr) {
            System.out.println(i);
        }
        System.out.println(s11.startsWith("ja"));
        String s12 = s11.substring(5);
        System.out.println(s12);
        String s13 = s11.substring(5, 7);
        System.out.println(s13);
        String s14 = s11.toUpperCase();
        System.out.println(s14);
        String s15 = s14.toLowerCase();
        System.out.println(s15);
        String s16="         haha       ";
        System.out.println(s16.trim());

        String s17=String.valueOf(1000);
        String s18=String.valueOf(new Cat(1,2));
        System.out.println(s17);
        System.out.println(s18);

    }
}
