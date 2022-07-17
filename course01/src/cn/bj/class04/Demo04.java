package cn.bj.class04;

public class Demo04 {
    public static void main(String[] args) {
        String s="abc";
        String intern = s.intern();
        System.out.println(intern);
        new Person("张三").runFast();//super
    }
}
abstract class Hero{

    /**
     * abstract
     * 有抽象方法的类叫抽象类
     * 我们可以调用没有方法体的方法 ：本地方法 String进去
     * 抽象类不能创建对象 但可以通过类名.静态方法来调用静态方法
     *抽象类中的构造方法主要是给变量赋值的
     */
    // 构造方法可以给变量  初始化赋值  初始化很重要
    private String name;
    public Hero(String name){

    }
    public abstract void runFast();
    public void run(){
        System.out.println("show");
    }

}
class Person extends Hero{


    public Person(String name) {
        super(name);
    }

    @Override
    public void runFast() {
        System.out.println("kuaipao");
    }
}