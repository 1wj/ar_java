package cn.bj.class04;

public class Demo02 {
    public static void main(String[] args) {
        new Zi();
        //类加载顺序
        //父类的静态代码块
        //子类的静态代码块
        //父类的构造方法
        //子类的构造方法
        //最后加载普通方法
    }

}
class Fu{
    //父类的静态代码块加载顺序最高
    static {
        System.out.println("父类的静态代码块");

    }
     public Fu(){
         System.out.println("父类的构造方法");
     }
}
class Zi extends Fu{
    //加载优先级特别高
    static {
        System.out.println("子类的静态代码块");

    }
    //静态方法除外  属于类方法 没有重写的必要 主要调用时不需要创建对象 体现不出继承
    public Zi(){
        System.out.println("子类的构造方法");
    }
}