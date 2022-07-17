package com.iweb.equals方法;

import java.util.Objects;

public class Cat {
    private  int age;
    private  int color;


    public Cat(int age, int color) {
        this.age = age;
        this.color = color;
    }


    /*@Override
    public boolean equals(Object obj){
    if(obj==null)
        return false;
    else {
        if(obj instanceof Cat){
            Cat c= (Cat) obj;
            if(c.age==this.age && c.color==this.color)
                return true;
            return false;
        }else {
            return false;
        }
    }}*/

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && color == cat.color;
    }



    @Override
    public int hashCode() {
        return Objects.hash(age, color);
    }
}
