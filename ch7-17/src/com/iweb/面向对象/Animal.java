package com.iweb.面向对象;

public class Animal {
    private String name;

    public Animal() {
    }

    public void enjoy(){
        System.out.println("叽叽喳喳");
    }
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
