package com.iweb.泛型的派生类;

public class MyInterFaceImpl implements MyInterFcace<String>{
    @Override
    public String getValue() {
        return "abc";
    }
}
