package com.iweb.面向对象;

public class Dog extends Animal{
    private String furColor;

    public Dog() {
    }

    @Override
    public void enjoy() {
        System.out.println("汪汪");
    }

    public Dog(String name, String furColor) {
        super(name);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
}
