package cn.bj.class04;


public class Demo03 {

    public static void main(String[] args) {
        new Pet().show();
    }
}
class Pet{
    //final关键字 最终类（不可继承） 最终方法（不可重写） 常量（）
    final int LAN_MAO=3;//常量大写
    public final void show(){
        System.out.println("宠物都会展示自己");
    }
}
class LanCat extends Pet {

}