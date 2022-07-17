package com.iweb.hw.p1;

/**
 * "Manager"类继承"Employee"类，有一个final成员变量"vehicle"
 */
public class Manager extends Employee {
    public final String vehicle="轿车";

    public Manager() {
    }

    @Override
    public void play() {
        System.out.println(this.getName()+"经理在唱歌");
    }


    public String getVehicle() {
        return vehicle;
    }

    public Manager(String name, int age, String sex, int salary) {
        super(name, age, sex, salary);
    }
    public void getCar(){
        System.out.println(this.getName()+"经理的座驾"+this.vehicle);
    }
}
