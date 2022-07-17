package com.iweb.泛型;
//自定义泛型类 T,E,V，K
public class Generic <E>{
    private  E key ;

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }

    public Generic() {
    }

    public Generic(E key) {
        this.key = key;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }
}
