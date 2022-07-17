package com.iweb;

public class Car {
    private String brand;
    private String price;
    private String maxspeed;

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                ", maxspeed='" + maxspeed + '\'' +
                '}';
    }

    public Car(String brand, String price, String maxspeed) {
        this.brand = brand;
        this.price = price;
        this.maxspeed = maxspeed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(String maxspeed) {
        this.maxspeed = maxspeed;
    }
}
