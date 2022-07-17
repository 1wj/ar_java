package com.iweb.类存储器;
//方法重载
public class TestMax {

    public static void main(String[] args) {
        TestMax tm=new TestMax();
        tm.max(100f,200f);
        tm.max(100,200);
        tm.max("12",100f,200f);

    }

    void  max(int a,int b){
        System.out.println( a>b?a:b+"整形");
    }
    void  max(float a,float b){
        System.out.println( a>b?a:b+"浮点型");
    }
    void  max(String c,float a,float b){
        System.out.println(a>b?a:b+"浮s");
    }
}
