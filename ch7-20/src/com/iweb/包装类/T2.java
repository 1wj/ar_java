package com.iweb.包装类;

public class T2 {
    public static void main(String[] args) {
       /* Integer i=new Integer(23);
        Character c=new Character('c');
        int i2=i.intValue();
        char c2=c.charValue();
        System.out.println(i2);
        System.out.println(c2);*/ //会自动装箱和拆箱
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        try {
            int i4=Integer.valueOf("a");
            System.out.println(i4);
            Integer i3=Integer.parseInt("1.1");
            System.out.println(i3);
        } catch (NumberFormatException e) {
            System.out.println("不是整形");
        }

        double d=Double.valueOf("45.01");
        System.out.println(d);
        Double d2=Double.parseDouble("45.01");
        System.out.println(d2);
        Double d3=Double.parseDouble("hello");
        System.out.println(d3);

    }
}
