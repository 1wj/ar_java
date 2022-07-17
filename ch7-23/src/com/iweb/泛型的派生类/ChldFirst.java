package com.iweb.泛型的派生类;

public class ChldFirst <T> extends Parent<T>{

    @Override
    public T getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(T value) {
        super.setValue(value);
    }
}
