package com.iweb.cat_mouse;

public class Cat {
    String name;
    void catchMouse(Mouse m){
        System.out.println("我是一只名叫"+name+"的猫，我捉到了名叫"+m.name+"的老鼠");
        m.scream();
    }
}
