package com.iweb.泛型的派生类;

public class T9 {
    public static void main(String[] args) {
        MyInterFaceImpl2<Integer,String > mf2=new MyInterFaceImpl2<>(100,"one");
        //MyInterFcace<Integer > mf2=new MyInterFaceImpl2<>(100,"one");

        Integer value = mf2.getValue();
        String key = mf2.getKey();
        System.out.println("key:"+key+",value:"+value);
    }
}
