package com.iweb.类存储器;
//java内存
public class ClassLoader {
    public static void main(String[] args) {
        int x=2;
        change1(x);
        System.out.println(x);

        Birthday b = new Birthday(1912, 10, 2);
        change3(b);
        b.info();
    }
    static void change1(int i){
         i=123;
    }
    static  void change2(Birthday c){
         c=new Birthday(2021,10,2);
    }
    static  void change3(Birthday c){
        c.setDay(120);
    }
}
