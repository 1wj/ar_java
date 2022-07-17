package com.iweb.泛型;

public class T4 {
    public static void main(String[] args) {
        Generic<String> generic=new Generic<>("avc");
        System.out.println(generic.getKey());

        Generic<Integer> generic2=new Generic<>(123);
        System.out.println(generic2.getKey());

        Generic generic3=new Generic<>(true );
        System.out.println(generic3.getKey());

        System.out.println( generic.getClass()==generic2.getClass());
    }
}
