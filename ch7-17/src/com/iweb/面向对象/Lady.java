package com.iweb.面向对象;

public class Lady {
    private String name;
    private Animal a;

    void mypetEnjoy(){
        this.a.enjoy();
    }

    public Lady() {
    }

    public Lady(String name, Animal a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getA() {
        return a;
    }

    public void setA(Animal a) {
        this.a = a;
    }
}
