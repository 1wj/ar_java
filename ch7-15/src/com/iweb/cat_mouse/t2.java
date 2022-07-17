package com.iweb.cat_mouse;

public class t2 {
    public static void main(String[] args) {
        Mouse m=new Mouse();
        m.name="jerry";
        Cat c=new Cat();
        c.name="tom";
        c.catchMouse(m);
    }

}
