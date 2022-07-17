package com.iweb.泛型的派生类;

public class ChildSecond extends Parent<Integer>{

    @Override
    public Integer getValue() {
        return super.getValue();
    }

    @Override
    public void setValue(Integer value) {
        super.setValue(value);
    }
}
