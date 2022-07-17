package com.iweb.类存储器;
//java内存
public class Birthday {
    int year;
    int month;
    int day;
    public Birthday( int year, int month, int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }
    public Birthday( ){

    }
    void info(){
        System.out.println("年"+year+"月"+month+"日"+day);

    }
    void setDay(int day){
        this.day=day;
    }

}
