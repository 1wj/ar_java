package cn.bj.class05;

public class Demo01 {
    public static void main(String[] args) {
        //多态：父类的引用执行子类的实例
       Animals d=new Dog();

        //子类的实例和父类的引用 堆内存是子类的实例 栈内存是父类的引用
        /**
         * 从编译的角度来说：编译看左边（的引用）
         * 调用子类的独有方法，不通过编译 因为父类中没有 加载不到
         *  d.sleep();
         *  从运行的角度来说:运行看右边  创建的那个对象执行调用方法
         *  d.eat();  -->狗吃肉
         */
        /**
         *   Dog dog= (Dog) new Animals();
         *   dog.sleep();
         *   dog.eat(); 报错 加载时 先加载了父类 找不到子类  也就是dog无法加载
         *   应该这样
         *   Dog dog=(Dog) d
         *   dog.sleep()  不报错
         *   Cat cat=(Cat) d;
         *   cat.play();   报错
         */
    }
}
class Animals{
    public void eat(){
        System.out.println("eat");
    }
}
class Dog extends Animals{
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void sleep(){
        System.out.println("狗会睡觉");

    }
}
class Cat extends Animals{
    public void eat(){
        System.out.println("猫吃鱼");
    }
    public void play(){
        System.out.println("猫在玩");

    }
}