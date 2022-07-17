package com.iweb.面向对象;

public class Bird extends Animal{
    private String birdColor;

    public Bird() {
    }

    public Bird(String name, String birdColor) {
        super(name);
        this.birdColor = birdColor;
    }

    public String getBirdColor() {
        return birdColor;
    }

    public void setBirdColor(String birdColor) {
        this.birdColor = birdColor;
    }
}
