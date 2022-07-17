package com.iweb.hm;



public class Test5 {
    public static void main(String[] args) {
        Vehicles v=new Vehicles("东风","red");
        v.showInfo();
        Vehicles c=new Car("五菱","green",20);
        Vehicles t=new Truck("一汽","blue",10000);

        if(c instanceof Car){
            ((Car)c).showCar();
        }
        if(t instanceof Truck){
            ((Truck) t).showTruck();
        }

    }
}
