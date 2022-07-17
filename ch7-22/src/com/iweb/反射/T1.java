package com.iweb.反射;
//对象。class  类.class  Class.forName 是什么东西
public class T1 {
    public static void main(String[] args) {
        try {
            Person p=new Person();
            System.out.println(p);
            Class c1=p.getClass();
         //   System.out.println ( c2==c1 );
            System.out.println(c1);
            Class c2=Person.class;
            System.out.println(c2);
            Class c3=Class.forName("com.iweb.反射.Person");
            System.out.println(c3);



        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
