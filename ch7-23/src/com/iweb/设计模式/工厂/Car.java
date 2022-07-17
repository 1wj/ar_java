package com.iweb.设计模式.工厂;
//工厂模式
public class Car {
    private String id;
    private String brand;
    private int maxspeed;
    private double price;

    public Car(String id, String brand, int maxspeed, double price) {
        this.id = id;
        this.brand = brand;
        this.maxspeed = maxspeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", maxspeed=" + maxspeed +
                ", price=" + price +
                '}';
    }
}
