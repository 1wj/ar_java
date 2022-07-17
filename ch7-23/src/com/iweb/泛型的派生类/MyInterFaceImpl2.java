package com.iweb.泛型的派生类;

public class MyInterFaceImpl2<T,E> implements MyInterFcace<T>{
    private T value;
    private E key;

    public MyInterFaceImpl2(T value, E key) {
        this.value = value;
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public E getKey() {
        return key;
    }

    public void setKey(E key) {
        this.key = key;
    }

    @Override
    public T getValue() {
        return value;
    }
}
