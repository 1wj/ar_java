package com.iweb.Objct类;

public class Person extends Object{
    private  int i;
    private String b;

    public Person() {
    }

    public Person(int i, String b) {
        this.i = i;
        this.b = b;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Person{" +
                "i=" + i +
                ", b='" + b + '\'' +
                '}';
    }


}
