package com.iweb.泛型的派生类;

public class Parent<E>{
    private E value;

    public Parent(E value) {
        this.value = value;
    }

    public Parent() {
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
