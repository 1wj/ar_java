package com.iweb.hm;

/**
 * 编写Car（小汽车）类继承于Vehicles类，增加int型成员属性seats（座位），
 *  * 还应增加成员方法showCar（在控制台显示小汽车的信息），并编写构造方法。
 */
public class Car extends Vehicles{
    private int seats;

    public Car() {

    }

    public Car(String brand, String color, int seats) {
        super(brand, color);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void showCar(){
        System.out.println("商标："+this.getBrand()+"，颜色："+this.getColor()+",座位："+this.getSeats());
    }
}
