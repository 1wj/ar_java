package com.iweb.hm;

/**
 * 编写Truck（卡车）类继承于Vehicles类，增加float型成员属性load（载重），
 * 还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
 * 在main方法中测试以上各类。
 */
public class Truck extends Vehicles{
    private float load;

    public Truck() {
    }

    public Truck(String brand, String color, float load) {
        super(brand, color);//调用父类有参的构造方法
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
    public void showTruck(){
        System.out.println("商标："+this.getBrand()+"，颜色："+this.getColor()+
                ",载重："+this.getLoad()+"t");
    }
}
