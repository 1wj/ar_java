package com.iweb.面向对象;

public class Cat extends Animal{
    private String eyesColor;

    @Override
    public void enjoy() {
        System.out.println("喵喵");
    }

    public Cat() {
    }

    public Cat(String name, String eyesColor) {
        super(name);
        this.eyesColor = eyesColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }
    void eat(){


    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }
}
