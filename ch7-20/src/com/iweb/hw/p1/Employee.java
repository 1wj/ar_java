package com.iweb.hw.p1;

/**
 * (2).	从Role类派生出一个"Employee"子类，该类具有Role类的所有成员（构造方法除外），
 * 并扩展	salary成员变量，同时增加一个静态成员变量“职工编号（ID）”。
 * 同样要有至少两个构造方法，要体现出this和super的几种用法，
 * 还要求覆盖play()方法，并提供一个final sing()方法。
 */
public class Employee extends Role{
    private int salary;
    public static int id;
    @Override
    public void play() {
        System.out.println(this.getName()+"员工喜欢打球");
    }
    public final void sing(){
        System.out.println(this.getName()+"员工正在唱歌");
    }
    public Employee() {
    }

    public Employee(String name, int age, String sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Employee.id = id;
    }
}
